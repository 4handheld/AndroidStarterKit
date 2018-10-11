package com.example.joe.a1pay.app.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.joe.a1pay.app.models.UserModel;
import com.example.joe.a1pay.app.network.apprequests.Transaction;

import java.util.ArrayList;

public class UserDB extends A1DB {

    public UserDB(Context context) {
        super(context);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        new SQLTable("User")
                .addStringColumn("identifier",false)
                .addStringColumn("payload",false)
                .create(db);

    }

    public ArrayList<UserModel> getUsers(Selector selector){
        return new ArrayList<UserModel>();
    }

    public void addUsers(ArrayList<UserModel> transactions){

    }

    public void updateUsers(Selector selector){

    }

    public void deleteUsers(Selector selector){

    }
}
