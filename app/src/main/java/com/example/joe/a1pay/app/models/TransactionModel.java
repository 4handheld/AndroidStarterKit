package com.example.joe.a1pay.app.models;

import org.json.JSONObject;

public class TransactionModel {
    enum STATUS{
       UNKNOWN,PENDING,DONE;
    }

    public STATUS getStatus(){
        return null;
    }

    public TransactionModel(){

    }

    public TransactionModel(JSONObject transactionobject){

    }

    public void initTransaction(UserModel user, ProductModel product, CardModel card){

    }

    public void requestUpdate(){

    }

}
