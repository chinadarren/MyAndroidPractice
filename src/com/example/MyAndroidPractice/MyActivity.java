package com.example.MyAndroidPractice;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    ImageView mImageView = null;
    TextView mTextView = null;
    static boolean t;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //   setContentView(R.layout.text_image_view);
    }

    private void inintView() {
        mTextView = (TextView) findViewById(R.id.tv);
        mImageView = (ImageView) findViewById(R.id.iv);
    }

    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.tv:
                mTextView = (TextView) v;
                if (t) {
                    mTextView.setTextColor(Color.RED);
                    t = false;
                } else {
                    mTextView.setTextColor(Color.YELLOW);
                    t = true;
                }
                break;
            case R.id.iv:
                mImageView = (ImageView) v;
                if (t) {
                    mImageView.setImageResource(R.drawable.ic_launcher);
                    t = false;
                } else {

                    mImageView.setImageResource(R.drawable.adc);
                    t = true;
                }
        }


//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.btnGridLayout:
//                setContentView(R.layout.gird_layout);
//                break;
//            case R.id.btnReturn:
//                setContentView(R.layout.main);
//                break;
//            case R.id.btnLinearLayout:
//                setContentView(R.layout.linear_layout);
//                break;
//            case R.id.linearReturn:
//                setContentView(R.layout.main);
//                break;
//            case R.id.btnTableLayout:
//                setContentView(R.layout.table_layout);
//                break;
//            case R.id.tableReturn:
//                setContentView(R.layout.main);
//                break;
//            case R.id.btnRelative:
//                setContentView(R.layout.reative_layout);
//                break;
//            case R.id.reativeReturn:
//                setContentView(R.layout.main);
//                break;
//            case R.id.linearBrief:
//                setContentView(R.layout.linear_brief);
//                break;
//            case R.id.linearBriefreturn:
//                setContentView(R.layout.linear_layout);
//                break;
//            case R.id.btnLinearBriefreturn:
//                setContentView(R.layout.main);
//                break;
//            case R.id.reativeBrief:
//                setContentView(R.layout.reative_brief);
//                break;
//            case R.id.reativeBriefReturn:
//                setContentView(R.layout.reative_layout);
//                break;
//            case R.id.btnRelativeReturn:
//                setContentView(R.layout.main);
//                break;
//            case R.id.tableBriefReturn:
//                setContentView(R.layout.table_layout);
//                break;
//            case R.id.btnTableBriefReturn:
//                setContentView(R.layout.main);
//                break;
    }
}
