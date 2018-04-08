package com.example.rahat.roomtest.database;

/**
 * Created by rahat on 4/8/18.
 */

public class DBHelper {
    public static void addUser(AppDatabase db,User user){
        db.userDao().insertAll(user);
    }


}
