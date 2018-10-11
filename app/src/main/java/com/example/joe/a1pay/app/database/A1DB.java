package com.example.joe.a1pay.app.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class A1DB extends SQLiteOpenHelper {

    public A1DB(Context context) {
        super(context, "A1AppDatabase", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

                new SQLTable("Responses")
                .addStringColumn("identifier",false)
                .addStringColumn("payload",false)
                .create(db);

    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        new SQLTable("Responses").drop();
        onCreate(db);
    }

    public void insert(ContentValues cv){
        this.getWritableDatabase().insert("",null,new ContentValues());
    }

    public void select(Selector selector){
       // this.getReadableDatabase().query()

        Cursor crsr=this.getReadableDatabase().rawQuery(selector.getQuery(),selector.getSelectors());
        crsr.moveToFirst();
        ArrayList<Object> arr=new ArrayList<Object>();
        do{
              String[] load=new String[selector.selectColumns().length];

              for(int i=0;i<load.length;i+=1){
            //      load[i]=c
              }
              arr.add(selector.returnObject(load));
        }while(crsr.moveToNext());

    }




}
