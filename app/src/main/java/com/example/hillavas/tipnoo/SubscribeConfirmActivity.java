package com.example.hillavas.tipnoo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class SubscribeConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe_confirm);
    }
    //Calligraphy
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
