package com.example.joe.a1pay.app.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


import com.example.joe.a1pay.app.models.TransactionModel;

import java.util.ArrayList;

public class TransactionsDB extends A1DB {
    public TransactionsDB(Context context) {
        super(context);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        new SQLTable("Transactions")
                .addStringColumn("identifier",false)
                .addStringColumn("payload",false)
                .create(db);

    }

    public ArrayList<TransactionModel> getTransactions(Selector selector){
        return new ArrayList<TransactionModel>();
    }

    public void addTransactions(ArrayList<TransactionModel> transactions){

    }

    public void updateTransactions(Selector selector){

    }

    public void deleteTransactions(Selector selector){

    }


}
