package com.developer.prihann.time_bus.logic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeBusLogic {
    public static String getMyStringTypeDate(Date date, String format){
        DateFormat dateFormat = new SimpleDateFormat(format);
        String stringDate = dateFormat.format(date);
        return stringDate;
    }

    public static Date getMyDateTypeDate(String date, String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date dateDate = null;
        try {
            dateDate = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateDate;
    }

}
