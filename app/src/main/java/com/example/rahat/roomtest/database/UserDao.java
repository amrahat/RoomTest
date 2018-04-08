package com.example.rahat.roomtest.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by rahat on 4/8/18.
 */

@Dao
public interface UserDao {
    @Query("Select * from user")
    List<User> getAllI();

    @Query("Select * from user where name LIKE :name")
    User findByName(String name);

    @Query("Select COUNT(*) from user")
    int countUsers();

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}
