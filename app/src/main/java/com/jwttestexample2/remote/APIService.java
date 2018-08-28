package com.jwttestexample2.remote;

import com.jwttestexample2.model.JWTToken;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface APIService {

 //Тик же ничего нового. Типичный запрос Retrofit
 // Анотация @FormUrlEncoded - обозначает, что тело запроса будет использовать форму URL-кодирования.
 // А точнее имена полей и значения будут кодироваться в кодировке UTF-8 до кодирования URI в соответствии с RFC-3986 .
 // @Post - запрос, который используется для безопасного(в теле запроса) изминения данных в основном и получения.
 // @Field - начения преобразуются в строки с использованием Retrofit.stringConverter.
 // @GET - запрос, используется только для получения данных, схож на POST но менее безопасен.
 // @Header - Задаёт заголовок со значением параметра
 @FormUrlEncoded
 @POST("/phptest/testlogin.php")
 Call<JWTToken> userlogin(@Field("username") String username, @Field("userpass")String userpass);

 @GET("/phptest/jwttest.php")
 Call<String> getUser(@Header("Authorization") String authorization);

}
