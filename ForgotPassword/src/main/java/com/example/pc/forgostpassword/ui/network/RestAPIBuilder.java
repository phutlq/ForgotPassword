package com.example.pc.forgostpassword.ui.network;

import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;

/**
 * Created by gary on 08/02/16.
 */

public class RestAPIBuilder {

	public static RestAPI buildRetrofitService(String mainUrl) {
		Retrofit retrofit = new Retrofit.Builder()
		.baseUrl(mainUrl)
		// Data converter
		.addConverterFactory(GsonConverterFactory.create())
		.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
		.client(new OkHttpClient.Builder().build())
		.build();

		return retrofit.create(RestAPI.class);
	}

}