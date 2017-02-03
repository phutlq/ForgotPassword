package com.example.pc.forgostpassword.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pc.forgostpassword.R;

import rx.Subscription;

/**
 * Created by PC on 02/02/2017.
 */

public class ForgotPassword extends FrameLayout {

    private EditText mEmail;

    private TextView mTextDemo,mTextForgotPass,mTextForgot;

    private RelativeLayout mButtonForgot,mBackground;

    private ImageView mImageButtonBack, mImageButtonNext,mImageButtonNextBackground;


    public ForgotPassword(Context context) {
        super(context);
        initView(context);
    }

    public ForgotPassword(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public ForgotPassword(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ForgotPassword(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.forgot_password, this);

        mEmail = (EditText) findViewById(R.id.edittext_email);
        mTextDemo = (TextView) findViewById(R.id.text_demo);
        mTextForgotPass = (TextView) findViewById(R.id.text_forgot_pass);
        mTextForgot = (TextView) findViewById(R.id.text_forgot);
        mButtonForgot = (RelativeLayout) findViewById(R.id.button_forgot);
        mImageButtonNext = (ImageView) findViewById(R.id.imageview_next_icon);
        mImageButtonBack = (ImageView) findViewById(R.id.imageview_back);
        mBackground = (RelativeLayout) findViewById(R.id.background);
        mImageButtonNextBackground = (ImageView) findViewById(R.id.imageview_next_background);

    }

    public void setTittleText(String text) {
        mTextDemo.setText(text);
    }

    public void setTittleSize(float size) {
        mTextDemo.setTextSize(size);
    }

    public void setTittleColor(int color) {
        mTextDemo.setTextColor((getResources().getColor(color)));
    }

    public void setTittleStyle(Typeface typeface) {
        mTextDemo.setTypeface(typeface);
    }

    public void setForgotText(String text) {
        mTextForgotPass.setText(text);
    }

    public void setForgotTextSize(float size) {
        mTextForgotPass.setTextSize(size);
    }

    public void setForgotTextColor(int color) {
        mTextForgotPass.setTextColor((getResources().getColor(color)));
    }

    public void setForgotTextStyle(Typeface typeface) {
        mTextForgotPass.setTypeface(typeface);
    }

    public void setButtonForgotText(String text) {
        mTextForgot.setText(text);
    }

    public void setButtonForgotTextSize(float size) {
        mTextForgot.setTextSize(size);
    }

    public void setButtonForgotTextColor(int color) {
        mTextForgot.setTextColor((getResources().getColor(color)));
    }

    public void setButtonForgotTextStyle(Typeface typeface) {
        mTextForgot.setTypeface(typeface);
    }

    public void setButtonBackSize(int width,int height) {
        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(width,height);
        mImageButtonBack.setLayoutParams(parms);
    }

    public void setButtonBackIcon(int icon) {
        mImageButtonBack.setImageResource(icon);
        mImageButtonBack.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public void setButtonNextIcon(int icon) {
        mImageButtonNext.setImageResource(icon);
        mImageButtonNext.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public void setButtonNextSize(int width,int height) {
        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(width,height);
        mImageButtonNext.setLayoutParams(parms);
    }

    public void setVisibleButtonBack(int visible) {
        mImageButtonBack.setVisibility(visible);
    }

    public void setmButtonForgotSize(int width,int height) {
        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(width,height);
        mButtonForgot.setLayoutParams(parms);
    }

    public void setEdittextEmailSize(int width,int height) {
        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(width,height);
        mEmail.setLayoutParams(parms);
    }

    public void setEdittextEmailBackground(int color) {
          mEmail.setBackgroundResource(color);
    }

    public void setButtonForgotBackground(int image) {
        mImageButtonNextBackground.setImageResource(image);
        mImageButtonNextBackground.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public void setBackgroundColor(int color) {
        mBackground.setBackgroundResource(color);
    }

    public RelativeLayout getmButtonForgot() {
        return mButtonForgot;
    }

    public void setmButtonForgot(RelativeLayout mButtonForgot) {
        this.mButtonForgot = mButtonForgot;
    }

   public String getEmailText(){
       return mEmail.getText().toString();
   }

}
