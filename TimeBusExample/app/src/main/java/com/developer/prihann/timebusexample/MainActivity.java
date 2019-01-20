package com.developer.prihann.timebusexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.developer.prihann.time_bus.helper.DefaultFormat;
import com.developer.prihann.time_bus.library.TimeBus;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date date = new Date();
        String stringDate = TimeBus.convertDateToString(date,"yyyy-MM-dd HH:mm:ss");

        String stringDate1 = "2009-12-31 23:59:59";
        Date date1 = TimeBus.convertStringToDate(stringDate1,"yyyy-MM-dd HH:mm:ss");

        System.out.println("+++++++++++++++++++++++++++++++++"+stringDate);
        System.out.println("---------------------------------"+date1);
    }
}
