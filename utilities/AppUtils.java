package com.alorma.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by alorma on 19/05/13.
 */
public class AppUtils {

    public static boolean checkFirstTime(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);

        return prefs.getBoolean("FIRST", true);
    }

    public static void saveFirstTime(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("FIRST", false);
        editor.commit();
    }
}
