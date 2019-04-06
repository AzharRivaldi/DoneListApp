package com.mig.donelistapp.model;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPref {
    public static void getAktivitas(Context c, String aktivitas) {
        SharedPreferences sp = c.getSharedPreferences("ACTIVITY_SAYA", c.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString("ACTIVITY", aktivitas);
        edit.commit();
    }

    public static String setAktivitas(Context c, String aktivitas) {
        SharedPreferences sp = c.getSharedPreferences("ACTIVITY_SAYA", c.MODE_PRIVATE);
        return sp.getString("ACTIVITY", aktivitas);
    }
}