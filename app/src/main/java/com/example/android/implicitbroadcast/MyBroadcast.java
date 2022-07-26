package com.example.android.implicitbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.exampleimplicitusedasexplicitbroad.ACTION_SEND".equals(intent.getAction()))
        {
            Toast.makeText(context, "R_App Receiver invoked", Toast.LENGTH_SHORT).show();
        }

    }
}
