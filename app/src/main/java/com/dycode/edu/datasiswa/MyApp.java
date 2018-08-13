package com.dycode.edu.datasiswa;

import android.app.Application;
import android.arch.persistence.room.Room;

/**
 * Created by WINDOWS 10 on 12/08/2018.
 */

public class MyApp extends Application {

    public static AppDatabase db;

    @Override
    public void onCreate(){
        super.onCreate();
        db= Room.databaseBuilder(getApplicationContext(), AppDatabase.class,"siswa.db").allowMainThreadQueries().build();
    }
}
