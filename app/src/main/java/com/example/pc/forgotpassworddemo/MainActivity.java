package com.example.pc.forgotpassworddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pc.forgostpassword.ui.ForgotPassword;
import com.example.pc.forgotpassworddemo.network.NetworkRequest;
import com.example.pc.forgotpassworddemo.network.RestAPI;
import com.example.pc.forgotpassworddemo.network.RestAPIBuilder;

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
        mForgotPassword.setTittleText("DEMO");
        mForgotPassword.setForgotText("FORGOT YOUR PASSWORD");
        mForgotPassword.setEdittextEmailBackground(R.drawable.edittext_border);
        mForgotPassword.setButtonForgotBackground(R.drawable.button_background);
        mForgotPassword.setButtonForgotText("Forgot");
        mForgotPassword.setButtonNextIcon(R.drawable.ic_next_main);


        mForgotPassword.getmButtonForgot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(mForgotPassword.getEmailText()).matches()) {
                    Toast.makeText(MainActivity.this,"Please enter a valid email adress", Toast.LENGTH_SHORT).show();
                } else {
                    RestAPI api = RestAPIBuilder.buildRetrofitService();
                    mGetPostSubscription = NetworkRequest.performAsyncRequest(api.requestForgot(mForgotPassword.getEmailText()), users -> {
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    }, throwable -> {
                        Toast.makeText(MainActivity.this, throwable.getMessage() + "", Toast.LENGTH_SHORT).show();
                    });
                }
            }
        });


    }
}
