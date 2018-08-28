package com.jwttestexample2.tokenmanager;

import android.content.Context;
import android.content.SharedPreferences;



public class TokenManager {

    private SharedPreferences sharedPreferences;
    private Context context;
    private SharedPreferences.Editor editor;
    private int Mode = 0;
    private static  final String REF_NAME="TokenManager";
    public static final String KEY_NAME = "username";
    public static final String KEY_JWT_TOKEN="jwttokenname";

    //Сохраняет файл с дефыолтным именем и значением.
    public TokenManager(Context context)
    {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(REF_NAME,Mode);
        editor = sharedPreferences.edit();

    }


    //Метод сохраняет входящие в него данные.
    public void createLoginSession(String username , String jwttokenname)
    {
        editor.putString(KEY_NAME,username);
        editor.putString(KEY_JWT_TOKEN,jwttokenname);
        editor.commit();



    }


    public void logOUT()
    {

    }



}
