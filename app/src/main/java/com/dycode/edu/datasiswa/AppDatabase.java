package com.dycode.edu.datasiswa;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by WINDOWS 10 on 12/08/2018.
 */
@Database(entities = {SiswaModel.class}, version = 1)
public abstract class AppDatabase  extends RoomDatabase{



        public abstract SiswaDao userDao();

}
