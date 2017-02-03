package com.example.pc.forgotpassworddemo.network;

import com.example.pc.forgotpassworddemo.model.Users;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface RestAPI {
	String API_ENDPOINT = "http://api-swivel-dev.greenglobal.vn:8100";

	@FormUrlEncoded
	@POST("/password/forgot/request")
	Observable<Users> requestForgot(@Field("email") String email);

}