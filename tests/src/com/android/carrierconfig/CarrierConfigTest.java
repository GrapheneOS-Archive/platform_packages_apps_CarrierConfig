package com.android.carrierconfig;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.PersistableBundle;
import android.service.carrier.CarrierIdentifier;
import android.test.InstrumentationTestCase;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.AssertionFailedError;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class CarrierConfigTest extends InstrumentationTestCase {

    /**
     * Iterate over all XML files in assets/ and ensure they parse without error.
     */
    public void testAllFilesParse() {
        forEachConfigXml(new ParserChecker() {
            public void check(XmlPullParser parser) throws XmlPullParserException, IOException {
                PersistableBundle b = DefaultCarrierConfigService.readConfigFromXml(parser,
                        new CarrierIdentifier("001", "001", "Test", "", "", ""));
                assertNotNull("got null bundle", b);
                assertTrue("got empty bundle", b.size() > 0);
            }
        });
    }

    /**
     * Check that the config bundles in XML files have valid filter attributes.
     * This checks the attribute names only.
     */
    public void testFilterValidAttributes() {
        forEachConfigXml(new ParserChecker() {
            public void check(XmlPullParser parser) throws XmlPullParserException, IOException {
                int event;
                while (((event = parser.next()) != XmlPullParser.END_DOCUMENT)) {
                    if (event == XmlPullParser.START_TAG && "carrier_config".equals(parser.getName())) {
                        for (int i = 0; i < parser.getAttributeCount(); ++i) {
                            String attribute = parser.getAttributeName(i);
                            switch (attribute) {
                                case "mcc":
                                case "mnc":
                                case "gid1":
                                case "gid2":
                                case "spn":
                                case "device":
                                    break;
                                default:
                                    fail("Unknown attribute '" + attribute  + "'");
                                    break;
                            }
                        }
                    }
                }
            }
        });
    }

    /**
     * Utility for iterating over each XML document in the assets folder.
     *
     * This can be used with {@link #forEachConfigXml} to run checks on each XML document.
     * {@link #check} should {@link #fail} if the test does not pass.
     */
    private interface ParserChecker {
        void check(XmlPullParser parser) throws XmlPullParserException, IOException;
    }

    /**
     * Utility for iterating over each XML document in the assets folder.
     */
    private void forEachConfigXml(ParserChecker checker) {
        AssetManager assetMgr = getInstrumentation().getTargetContext().getAssets();
        try {
            String[] files = assetMgr.list("");
            assertNotNull("failed to list files", files);
            assertTrue("no files", files.length > 0);
            for (String fileName : files) {
                try {
                    if (!fileName.startsWith("carrier_config_")) continue;

                    XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
                    XmlPullParser parser = factory.newPullParser();
                    parser.setInput(assetMgr.open(fileName), "utf-8");

                    checker.check(parser);

                } catch (Throwable e) {
                    throw new AssertionError("Problem in " + fileName + ": " + e.getMessage(), e);
                }
            }
        } catch (IOException e) {
            fail(e.toString());
        }
    }
}
