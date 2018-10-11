package com.example.joe.a1pay.app.network;

public interface A1RequestInterface {

    public String getURL();

    public Network getParams();

    public void onResponse(String response);

}
