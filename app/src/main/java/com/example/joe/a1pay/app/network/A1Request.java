package com.example.joe.a1pay.app.network;

import android.content.Context;

public class A1Request extends Network {

    A1RequestInterface inteerface;

    public A1Request(Context C, A1RequestInterface a1interface) {
        super(a1interface.getURL(), C);
        this.inteerface=a1interface;
        this.inteerface.getParams().execute();
    }

    @Override
    public void onPostExecute(String response){
        super.onPostExecute(response);
        this.inteerface.onResponse(response);
    }



}
