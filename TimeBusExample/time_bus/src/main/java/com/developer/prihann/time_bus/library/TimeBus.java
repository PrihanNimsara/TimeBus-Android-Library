package com.developer.prihann.time_bus.library;

import android.content.Context;

import com.developer.prihann.time_bus.logic.TimeBusLogic;

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

   public static String convertDateToString(Date date,String format){
        return TimeBusLogic.getMyStringTypeDate(date,format);
   }

   public static Date convertStringToDate(String stringDate,String format){
       return TimeBusLogic.getMyDateTypeDate(stringDate,format);
   }
}
