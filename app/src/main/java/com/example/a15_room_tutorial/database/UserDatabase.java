package com.example.a15_room_tutorial.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.a15_room_tutorial.User;

@Database(entities = {User.class}, version = 1)
public
abstract class UserDatabase extends RoomDatabase {
    private static UserDatabase instance;
    private static final String DATABASE_NAME = "user.db";

    public abstract UserDAO userDAO();

    public static  UserDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context, UserDatabase.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

}
