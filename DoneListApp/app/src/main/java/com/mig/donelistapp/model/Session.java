package com.mig.donelistapp.model;

import android.content.Context;
import android.content.SharedPreferences;


public class Session {
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    Context ctx;

    public Session(Context ctx) {
        this.ctx = ctx;
        prefs = ctx.getSharedPreferences("mig", Context.MODE_PRIVATE);
        editor = prefs.edit();
    }

    public void setLoggedin(boolean donelistapp) {
        editor.putBoolean("loggedInmode", donelistapp);
        editor.commit();
    }

    public boolean loggedin() {
        return prefs.getBoolean("loggedInmode", false);
    }
}
