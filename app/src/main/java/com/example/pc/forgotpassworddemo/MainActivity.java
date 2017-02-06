package com.example.pc.forgotpassworddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.pc.forgostpassword.ui.ForgotPassword;

import rx.Subscription;

public class MainActivity extends AppCompatActivity {

    private Subscription mGetPostSubscription;

    private ForgotPassword mForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mForgotPassword = (ForgotPassword) findViewById(R.id.activity_main_layout_forgot);
        mForgotPassword.setBackgroundColor(R.drawable.sharpe_gradient);
        mForgotPassword.setButtonBackIcon(R.drawable.ic_back);
        mForgotPassword.setVisibleButtonBack(View.VISIBLE);
        mForgotPassword.setTittleText("DEMO");
        mForgotPassword.setForgotText("FORGOT YOUR PASSWORD");
        mForgotPassword.setEdittextEmailBackground(R.drawable.edittext_border);
        mForgotPassword.setButtonForgotBackground(R.drawable.button_background);
        mForgotPassword.setButtonForgotText("Forgot");
        mForgotPassword.setButtonNextIcon(R.drawable.ic_next_main);
        mForgotPassword.sendRequestForgotPassword(MainActivity.this,Constant.MAIN_URL,Constant.MAIN_URL+Constant.FORGOT_PASS_URL);

    }
}
