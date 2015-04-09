package com.android.carrierconfig;

import android.os.Bundle;
import android.service.carrier.CarrierConfigService;
import android.service.carrier.CarrierIdentifier;
import android.telephony.CarrierConfigManager;
import android.util.Log;

import java.util.HashMap;

public class DefaultCarrierConfigService extends CarrierConfigService {

    private static final String TAG = "DefaultCarrierConfigService";

    private static final HashMap<String, Bundle> sCarrierOverlays;

    static {
        sCarrierOverlays = new HashMap<>();

        Bundle config00101 = new Bundle();
        Bundle config001001 = new Bundle();
        Bundle config001010 = new Bundle();
        Bundle config20801 = new Bundle();
        Bundle config20802 = new Bundle();
        Bundle config246081 = new Bundle();
        Bundle config310004 = new Bundle();
        Bundle config310028 = new Bundle();
        Bundle config310120 = new Bundle();
        Bundle config310160 = new Bundle();
        Bundle config310200 = new Bundle();
        Bundle config310210 = new Bundle();
        Bundle config310220 = new Bundle();
        Bundle config310230 = new Bundle();
        Bundle config310240 = new Bundle();
        Bundle config310250 = new Bundle();
        Bundle config310260 = new Bundle();
        Bundle config310270 = new Bundle();
        Bundle config310300 = new Bundle();
        Bundle config310310 = new Bundle();
        Bundle config310410 = new Bundle();
        Bundle config310490 = new Bundle();
        Bundle config310530 = new Bundle();
        Bundle config310580 = new Bundle();
        Bundle config310590 = new Bundle();
        Bundle config310640 = new Bundle();
        Bundle config310660 = new Bundle();
        Bundle config310800 = new Bundle();
        Bundle config311390 = new Bundle();
        Bundle config311480 = new Bundle();

        config00101.putBoolean(CarrierConfigManager.BOOL_SHOW_APN_SETTING_CDMA, true);
        config001001.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config001010.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);

        config20801.putString(CarrierConfigManager.STRING_VVM_DESTINATION_NUMBER, "21124");
        config20801.putShort(CarrierConfigManager.SHORT_VVM_PORT_NUMBER, (short) 20481);
        config20801.putString(CarrierConfigManager.STRING_VVM_TYPE,
                CarrierConfigManager.VVM_TYPE_OMTP);

        config20802.putString(CarrierConfigManager.STRING_VVM_DESTINATION_NUMBER, "21124");
        config20802.putShort(CarrierConfigManager.SHORT_VVM_PORT_NUMBER, (short) 20481);
        config20802.putString(CarrierConfigManager.STRING_VVM_TYPE,
                CarrierConfigManager.VVM_TYPE_OMTP);

        config246081.putBoolean(CarrierConfigManager.BOOL_SHOW_APN_SETTING_CDMA, true);

        config310004.putInt(CarrierConfigManager.INT_VOLTE_REPLACEMENT_RAT, 6);

        config310028.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310028.putBoolean(CarrierConfigManager.BOOL_SHOW_APN_SETTING_CDMA, true);
        config310028.putInt(CarrierConfigManager.INT_VOLTE_REPLACEMENT_RAT, 6);

        config310120.putInt(CarrierConfigManager.INT_VOLTE_REPLACEMENT_RAT, 6);

        config310160.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310160.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310200.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310200.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310210.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310210.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310220.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310220.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310230.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310230.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310240.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310240.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310250.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310250.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310260.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310260.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);
        config310260.putInt(CarrierConfigManager.INT_VOLTE_REPLACEMENT_RAT, 3);

        config310270.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310270.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310300.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310300.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310310.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310310.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310410.putInt(CarrierConfigManager.INT_VOLTE_REPLACEMENT_RAT, 3);

        config310490.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310490.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310530.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310530.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310580.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310580.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310590.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310590.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310640.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310640.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310660.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310660.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config310800.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config310800.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_TTY_SUPPORTED, false);

        config311390.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config311390.putBoolean(CarrierConfigManager.BOOL_SHOW_APN_SETTING_CDMA, true);
        config311390.putInt(CarrierConfigManager.INT_VOLTE_REPLACEMENT_RAT, 6);

        config311480.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_AVAILABLE, true);
        config311480.putBoolean(CarrierConfigManager.BOOL_CARRIER_VOLTE_PROVISIONED, true);
        config311480.putInt(CarrierConfigManager.INT_VOLTE_REPLACEMENT_RAT, 6);

        sCarrierOverlays.put("00101", config00101);
        sCarrierOverlays.put("001001", config001001);
        sCarrierOverlays.put("001010", config001010);
        sCarrierOverlays.put("20801", config20801);
        sCarrierOverlays.put("20802", config20802);
        sCarrierOverlays.put("246081", config246081);
        sCarrierOverlays.put("310004", config310004);
        sCarrierOverlays.put("310028", config310028);
        sCarrierOverlays.put("310120", config310120);
        sCarrierOverlays.put("310160", config310160);
        sCarrierOverlays.put("310200", config310200);
        sCarrierOverlays.put("310210", config310210);
        sCarrierOverlays.put("310220", config310220);
        sCarrierOverlays.put("310230", config310230);
        sCarrierOverlays.put("310240", config310240);
        sCarrierOverlays.put("310250", config310250);
        sCarrierOverlays.put("310260", config310260);
        sCarrierOverlays.put("310270", config310270);
        sCarrierOverlays.put("310300", config310300);
        sCarrierOverlays.put("310310", config310310);
        sCarrierOverlays.put("310410", config310410);
        sCarrierOverlays.put("310490", config310490);
        sCarrierOverlays.put("310530", config310530);
        sCarrierOverlays.put("310580", config310580);
        sCarrierOverlays.put("310590", config310590);
        sCarrierOverlays.put("310640", config310640);
        sCarrierOverlays.put("310660", config310660);
        sCarrierOverlays.put("310800", config310800);
        sCarrierOverlays.put("311390", config311390);
        sCarrierOverlays.put("311480", config311480);
    }


    public DefaultCarrierConfigService() {
        Log.d(TAG, "Service created");
    }

    @Override
    public Bundle onLoadConfig(CarrierIdentifier id) {
        Log.d(TAG, "Config being fetched");
        // Return null for unknown networks - they should use the defaults.
        return sCarrierOverlays.get(id.getMcc() + id.getMnc());
    }
}
