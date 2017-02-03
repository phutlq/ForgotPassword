package com.example.pc.forgotpassworddemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PC on 24/01/2017.
 */

public class Users {

   @SerializedName("email")
    String mEmail;

    @SerializedName("password")
    String mPassWord;

    @SerializedName("password_confirmation")
    String mPassConfirm;
}
