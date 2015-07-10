package com.example.MyAndroidPractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by LeiChen on 7/10/2015.
 */
public class secondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.intent_layout);
    }
}
