package com.example.joe.a1pay.app.network;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;


import java.io.File;
import java.util.ArrayList;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by UserModel on 11/4/2015.
 */
public  class Network extends AsyncTask<String,Integer,String>{
    String Url="";
   public Context c;
    ArrayList<String[]> parameters=new ArrayList<String[]>();
    ArrayList<String[]> files=new ArrayList<String[]>();
  String feedback="";
    MultipartBody.Builder rqq;
    boolean showFeedback =true;
    //

    public Network(String url, Context C){
        this.Url=url;
         this.c=C;
        rqq=new MultipartBody.Builder().setType(MultipartBody.FORM);
      //  frmbdy=new MultipartBody.Builder().setType(MultipartBody.FORM);
    }

    public Network setURL(String url){
        this.Url=url;
        return this;
    }

    public Network addString(String key,String value){
        rqq.addFormDataPart(key, value);
        return this;
    }

    public Network addFile(String key,File file){
        rqq.addFormDataPart(key, file.getName(), RequestBody.create(MediaType.parse("multipart/form-data"),file));
        return this;
    }

    public void show(String str){
        Toast.makeText(this.c,str,Toast.LENGTH_SHORT).show();
    }



    @Override
    protected synchronized String doInBackground(String... params) {
        String s="";

        try {
            OkHttpClient client = new OkHttpClient();
            RequestBody param=rqq.build();
            Request req = new Request.Builder().url(this.Url)

                    .post(param)
                    .build();
            Response res = client.newCall(req).execute();
            s=res.body().string();
        }catch (Exception e){
            s=e.toString();
        }
        return s;
    }



    @Override
    protected void onProgressUpdate(Integer... values){
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result){
        super.onPostExecute(result);
        if(showFeedback) {
            Toast.makeText(c, "IO : " + result, Toast.LENGTH_SHORT).show();
        }
    }
}
