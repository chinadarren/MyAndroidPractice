package com.example.MyAndroidPractice;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    ImageView mImageView = null;
    TextView mTextView = null;
    static boolean t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        // setContentView(R.layout.text_image_view);
        Button button1 = (Button) findViewById(R.id.btnIntent);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(MyActivity.this,secondActivity.class);
                startActivity(intent);
            }
        });
    }

    private void inintView() {
        mTextView = (TextView) findViewById(R.id.tv);
        mImageView = (ImageView) findViewById(R.id.iv);
    }
public boolean onCreateOptionsMenu(Menu menu){
   getMenuInflater().inflate(R.menu.main,menu);
return true;
}
public boolean onOptionsItemSelected(MenuItem item){
    switch(item.getItemId()){
        case R.id.add_item:
            Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
            break;
        case  R.id.remove_item:
            Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
            break;
        default:
    }
    return true;
}


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGridLayout:
                setContentView(R.layout.gird_layout);
                break;
            case R.id.btnGirdReturn:
                setContentView(R.layout.layout_main);
                break;
            case R.id.btnLinearLayout:
                setContentView(R.layout.linear_brief);
                break;
            case R.id.btnLayoutRetrun:
                setContentView(R.layout.linear_brief);
                break;
            case R.id.btnTableLayout:
                setContentView(R.layout.table_brief);
                break;
            case R.id.btnTableReturn:
                setContentView(R.layout.layout_main);
                break;
            case R.id.btnRelative:
                setContentView(R.layout.relative_brief);
                break;
    //        case R.id.btnSignupReturn:
    //            setContentView(R.layout.relative_brief);
     //           break;
            case R.id.btnLinearSignup:
                setContentView(R.layout.linear_layout);
                break;
            case R.id.LinearBriefReturn:
                setContentView(R.layout.layout_main);
                break;
            case R.id.btnReativeSignup:
                setContentView(R.layout.relative_layout);
                break;
            case R.id.btnReativeBriefReturn:
                setContentView(R.layout.layout_main);
                break;
            case R.id.btnTextIamge:
                setContentView(R.layout.text_image_view);
                break;
            case R.id.btnTextViewRetrun:
                setContentView(R.layout.main);
                break;
            case R.id.btnLayout:
                setContentView(R.layout.layout_main);
                break;
            case R.id.btnLayoutMianReturn:
                setContentView(R.layout.main);
                break;
            case R.id.btnLinearCodeReturn:
                setContentView(R.layout.linear_brief);
                break;
            case R.id.btnLinearCode:
                setContentView(R.layout.liner_code);
                break;
            case R.id.btnTableSginup:
                setContentView(R.layout.table_layout);
                break;
            case R.id.btnRelativeCode:
                setContentView(R.layout.relative_code);
                break;
            case R.id.btnReativeCodeReturn:
                setContentView(R.layout.relative_brief);
                break;
            case R.id.btnTableCode:
                setContentView(R.layout.table_code);
                break;
            case R.id.btntableCodeReturn:
                setContentView(R.layout.table_brief);
                break;
            case R.id.btnGirdLSginUp:
                setContentView(R.layout.gird_layout);
                break;
            case R.id.btnGridSginupReturn:
                setContentView(R.layout.gird_brief);
                break;
            case R.id.btnGirdBriefCode:
                setContentView(R.layout.gird_code);
                break;
            case R.id.btnGirdCodeReturn:
                setContentView(R.layout.gird_brief);
                break;
            case R.id.btnRJavaReturn:
                setContentView(R.layout.ractivity_layout);
                break;
            case R.id.btnRLayout:
                setContentView(R.layout.rjava_brief);
                break;
            case R.id.btnRAReturn:
                setContentView(R.layout.main);
                break;
            case R.id.btnTextView:
                setContentView(R.layout.textview_layout);
                break;
            case R.id.btnImageView:
                setContentView(R.layout.imageview_layout);
              break;
            case R.id.btnrandactivuity:
                setContentView(R.layout.ractivity_layout);
                break;
            case R.id.btnALayout:
                setContentView(R.layout.activity_brief);
                break;
            case R.id.btnExit:
                finish();
                break;
            case R.id.btnToastBrief:
                setContentView(R.layout.toast_brief);
                break;
            case R.id.btnMenuBrief:
                setContentView(R.layout.toast_brief);
                break;
            case R.id.btnToastMenu:
                setContentView(R.layout.toastmenu_layout);
                break;
            case R.id.btnToastMenuReturn:
                setContentView(R.layout.toastmenu_layout);
                break;
            case R.id.btnIntent:
                setContentView(R.layout.intent_layout);
                break;
            //case R.id.btnxIntent:
            //    setContentView(R.layout.xintent_layout);
            //    break;
            //case R.id.btnyIntent:
            //    setContentView(R.layout.yintent_layout);
            //    break;



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
                break;
        }
    }
}
