package yobra.msupa.brianyobra.myapplication;

/**
 * Created by brianyobra on 8/27/18.
 */


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.widget.Toast;
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent Detected.",
                Toast.LENGTH_LONG).show();
    }
}