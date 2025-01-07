package id.laskarmedia.extend_core;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class VPNHelper extends de.blinkt.openvpn.VPNHelper {

    public VPNHelper(Activity activity) {
        super(activity);
        Log.e("11111111111111111111111","11111111111111111111111");

    }

    @Override
    public void startVPN() {
        super.startVPN();
        Log.e("2222222222222222222222","2222222222222222222222");
    }

    @Override
    public void startVPN(String config, String username, String password, String name, List<String> bypass) {
        super.startVPN(config, username, password, name, bypass);
        Log.e("3333333333333333333","33333333333333333333");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("44444444444444444","4444444444444444444444");
    }
}