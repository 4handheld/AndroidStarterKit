package com.example.joe.a1pay.app.database;

import android.content.Context;

public class Test {

    public  Test(){
        new A1DB(null).select(new Selector() {
            @Override
            public String getQuery() {
                return "select * from ada where name=? ";
            }

            @Override
            public String[] getSelectors() {
                return new String[]{"sss"};
            }

            @Override
            public Sample returnObject() {
                return new Sample();
            }
        });
    }

    class Sample{

    }
}
