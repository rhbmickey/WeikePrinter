package com.example.ccb.weikeprinter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by CCB on 2016/5/2.
 */
public class selectAcivity extends Activity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.select_main);
        textView = (TextView) findViewById(R.id.select_textview);
        textView.setText("请选择打印类型");
    }
}
