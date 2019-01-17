package com.developer.prihann.time_bus.logics;

import android.content.Context;

import com.developer.prihann.time_bus.helpers.TimeBusHelpers;

import java.util.Date;

public final class TimeBus {
    private static TimeBus timeBus;
    private static Context timeBuscontext;

    private TimeBus() {
    }

    public static TimeBus setContext(Context context){
        timeBuscontext = context.getApplicationContext();
        if (timeBuscontext == null)
            timeBus = new TimeBus();
        return timeBus;
    }

   public static String convertDatetoString(Date date){

        return TimeBusHelpers.getMyDate(date);
   }
}
