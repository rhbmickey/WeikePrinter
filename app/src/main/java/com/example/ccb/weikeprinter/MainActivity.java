package com.example.ccb.weikeprinter;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        new Thread(new theadShow()).start();
    }
    //handler类接受数据
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (msg.what ==1){
                Intent intent = new Intent(MainActivity.this,selectAcivity.class);
                startActivity(intent);
            }
        }
    };
    //Thread类开启定时
    class theadShow implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                Message msg = new Message();
                msg.what = 1;
                handler.sendMessage(msg);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
