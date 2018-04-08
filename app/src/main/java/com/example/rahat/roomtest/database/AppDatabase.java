package com.example.rahat.roomtest.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by rahat on 4/8/18.
 */
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;

    public abstract UserDao userDao();

    public static AppDatabase getAppDatabse(Context context) {

        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"user-database")
                    .allowMainThreadQueries()
                    .build();
        }

        return instance;
    }

    public static void destroyInstance(){
        instance = null;
    }
}
