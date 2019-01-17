package com.developer.prihann.time_bus.helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeBusHelpers {
    public static String getMyDate(Date date){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String reportDate = df.format(date);
        return reportDate;
    }
}
