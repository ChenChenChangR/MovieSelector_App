package com.example.final_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    ImageView img1, img2, img3, img4, img5, img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.textView);
        img1 = (ImageView) findViewById(R.id.imageView);
        img2 = (ImageView) findViewById(R.id.imageView2);
        img3 = (ImageView) findViewById(R.id.imageView3);
        img4 = (ImageView) findViewById(R.id.imageView4);
        img5 = (ImageView) findViewById(R.id.imageView5);
        img6 = (ImageView) findViewById(R.id.imageView6);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);

        Thread t = new Thread(runnable);
        t.start();
    }
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            do {
                try {
                    Thread.sleep(1000);
                    Message msg = new Message();
                    msg.what = 1;
                    mHandler.sendMessage(msg);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (true);
        }
    };
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 1:
                    long time = System.currentTimeMillis();
                    Date date = new Date(time);
                    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒 EEE");
                    textView.setText(format.format(date));
                    break;
                default:
                    break;

            }
        }

    };

    @Override
    public void onClick(View v) {
        if (v == img1) {
            Intent intent = new Intent(this, MainActivity3.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", "路卡的夏天");
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (v == img2) {
            Intent intent = new Intent(this, MainActivity3.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", "老師！你會不會談戀愛");
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (v == img3) {
            Intent intent = new Intent(this, MainActivity3.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", "黑寡婦");
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (v == img4) {
            Intent intent = new Intent(this, MainActivity3.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", "惡靈陷阱");
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (v == img5) {
            Intent intent = new Intent(this, MainActivity3.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", "怪物奇兵 全新世代");
            intent.putExtras(bundle);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, MainActivity3.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", "密弒遊戲2 勝者危亡");
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}