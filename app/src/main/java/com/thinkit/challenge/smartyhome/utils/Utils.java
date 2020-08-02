package com.thinkit.challenge.smartyhome.utils;

import android.app.Activity;
import android.content.Intent;

import java.util.Calendar;

public class Utils {


    public static String getCurrenttDate()
    {
        Calendar calendar = Calendar.getInstance();
        String[] monthName={"January","February","March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String month=monthName[calendar.get(Calendar.MONTH)];
        String day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        String year = String.valueOf(calendar.get(Calendar.YEAR));

        return  month+" "+day+", "+ year ;

    }

    public  static void switchActivity (Activity current, Class destination)
    {
        Intent intent = new Intent(current,destination);
        current.startActivity(intent);
    }
}
