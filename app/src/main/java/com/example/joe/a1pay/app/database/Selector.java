package com.example.joe.a1pay.app.database;

public interface Selector {

    public String getQuery();

    public String[] getSelectors();

    public String[] selectColumns();

    public Object returnObject(String[] columnvalues);



}
