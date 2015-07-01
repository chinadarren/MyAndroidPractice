package com.example.MyAndroidPractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGridLayout:
                setContentView(R.layout.gird_layout);
                break;
            case R.id.btnReturn:
                setContentView(R.layout.main);
                break;
            case R.id.btnLinearLayout:
                setContentView(R.layout.linear_layout);
                break;
            case R.id.linearReturn:
                setContentView(R.layout.main);
                break;
            case R.id.btnTableLayout:
                setContentView(R.layout.table_layout);
                break;
            case R.id.tableReturn:
                setContentView(R.layout.main);
                break;
            case R.id.btnRelative:
                setContentView(R.layout.reative_layout);
                break;
            case R.id.reativeReturn:
                setContentView(R.layout.main);
                break;
            case R.id.linearBrief:
                setContentView(R.layout.linear_brief);
                break;
            case R.id.linearBriefreturn:
                setContentView(R.layout.linear_layout);
                break;
            case R.id.btnLinearBriefreturn:
                setContentView(R.layout.main);
                break;
            case R.id.reativeBrief:
                setContentView(R.layout.reative_brief);
                break;
            case R.id.reativeBriefReturn:
                setContentView(R.layout.reative_layout);
                break;
            case R.id.btnRelativeReturn:
                setContentView(R.layout.main);
                break;
//            case R.id.tableBriefReturn:
//                setContentView(R.layout.table_layout);
//                break;
//            case R.id.btnTableBriefReturn:
//                setContentView(R.layout.main);
//                break;
        }
    }
}