package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {
    ListView lv;
    List<String> selected = new ArrayList<String>();
    TextView tv,tv2 ;
    String position;
    String place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tv = (TextView)findViewById(R.id.textView21);
        tv2 = (TextView)findViewById(R.id.textview22);
        tv.getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG );
        tv2.getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG );
        Bundle bundle = getIntent().getExtras();
        String results = bundle.getString("result");
        //position = bundle.getString("position");
        String [] splite_line = results.split(",");
        place = splite_line[4];
        selected.add(results);
        lv = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                MainActivity5.this,
                android.R.layout.simple_list_item_1,
                selected);
        lv.setAdapter(arrayAdapter);


    }
    public void onClick(View v){
        Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
        startActivity(intent);
    }
    public void call(View view){
        Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:0800123123"));
        startActivity(it);
    }
    public void GPS(View view){
        Intent it = new Intent();
        it.setAction(Intent.ACTION_VIEW);

        it.setData(Uri.parse("google.navigation:q="+place));
        startActivity(it);
    }
}