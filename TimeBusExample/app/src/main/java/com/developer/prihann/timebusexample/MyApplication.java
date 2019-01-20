package com.developer.prihann.timebusexample;

import android.app.Application;

import com.developer.prihann.time_bus.library.TimeBus;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        TimeBus.setContext(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
