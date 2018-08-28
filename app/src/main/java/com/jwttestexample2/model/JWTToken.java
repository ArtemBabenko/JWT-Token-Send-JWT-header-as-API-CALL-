package com.jwttestexample2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//Модель токена с гетерами и сетерами и одним поллем.
public class JWTToken {

    @SerializedName("token")// Присваивает имя json
    @Expose// Подтверждает
    public String token;

    public JWTToken() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
