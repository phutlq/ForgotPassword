package com.example.pc.forgostpassword.ui.network;

import com.example.pc.forgostpassword.ui.model.Users;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;
import rx.Observable;

public interface RestAPI {

		@FormUrlEncoded
		@POST()
		Observable<Users> requestForgot (@Url String url,@Field("email") String email);

}