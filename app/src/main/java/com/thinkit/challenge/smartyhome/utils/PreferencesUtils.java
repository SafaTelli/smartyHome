package com.thinkit.challenge.smartyhome.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesUtils {


    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";

    SharedPreferences sharedpreferences;


    public  PreferencesUtils (Context context)
    {
        sharedpreferences = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
    }

    public void putName(String name)
    {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(Name, name);
        editor.commit() ;
    }

    public String getName()
    {
        return sharedpreferences.getString(Name,"");

    }


}
