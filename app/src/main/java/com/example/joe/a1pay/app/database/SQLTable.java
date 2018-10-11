package com.example.joe.a1pay.app.database;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class SQLTable {

    private String TableName="Test";

    private ArrayList<String[]> columns;

    public SQLTable(String table){
            TableName=table;
            columns=new ArrayList<String[]>();
    }

    public SQLTable addStringColumn(String column,boolean isnull){
        columns.add(new String[]{"TEXT",  column, isnull?"":"NOT"});
        return this;
    }

    public SQLTable addIntColumn(String column,boolean isnull){
        columns.add(new String[]{"INTEGER",  column, isnull?"":"NOT"});
        return this;
    }

    public void create(SQLiteDatabase db){
        String query="".concat("create table if not exists ").concat(TableName).concat(" ( ");

        for (String[] data:columns) {
            query .concat(data[1]) .concat(" ") .concat(data[0]) .concat(" ") ;// .concat(data[2]) .concat(" NULL ");
            //ie         name                        TEXT
            query.concat(",");
            //,
        }
        query .concat("date_time_stored") .concat(" ") .concat("TEXT") .concat(" ") ;
        query.concat(" )");

        db.execSQL(query);
    }

    public void drop(){

    }



}
