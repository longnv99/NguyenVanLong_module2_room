package com.example.a15_room_tutorial.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.a15_room_tutorial.User;

import java.util.List;

@Dao
public
interface UserDAO {

    @Insert
    void insertUser(User user);

    @Query("SELECT * FROM user")
    List<User> getAllUser();
}
