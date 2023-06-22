package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener, TextWatcher {

    Spinner sp1, sp2, sp3, sp_movie, sp_date, sp_time;
    EditText edt1, edt2, edt3;
    CheckBox checkBox;
    ImageView im;
    String results;
    int cost;
    String position;
    TextView tv1, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        sp1 = (Spinner) findViewById(R.id.spinner);
        sp2 = (Spinner) findViewById(R.id.spinner2);
        sp3 = (Spinner) findViewById(R.id.spinner3);
        sp_movie = (Spinner) findViewById(R.id.spinner4);
        sp_date = (Spinner) findViewById(R.id.spinner5);
        sp_time = (Spinner) findViewById(R.id.spinner6);
        edt1 = (EditText) findViewById(R.id.editTextTextPersonName);
        edt2 = (EditText) findViewById(R.id.editTextTextPersonName3);
        edt3 = (EditText) findViewById(R.id.editTextTextPersonName4);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        im = (ImageView) findViewById(R.id.imageView7);
        tv1 = (TextView) findViewById(R.id.textView25);
        tv2 = (TextView) findViewById(R.id.textView26);

        sp1.setOnItemSelectedListener(this);
        sp2.setOnItemSelectedListener(this);
        sp3.setOnItemSelectedListener(this);
        sp_movie.setOnItemSelectedListener(this);
        sp_date.setOnItemSelectedListener(this);
        sp_time.setOnItemSelectedListener(this);
        checkBox.setOnCheckedChangeListener(this);
        edt1.addTextChangedListener(this);
        edt2.addTextChangedListener(this);
        edt3.addTextChangedListener(this);


        Bundle bundle = getIntent().getExtras();
        String movie = bundle.getString("movie");
        if (movie.contains("路卡")) {
            sp_movie.setSelection(0);
        } else if (movie.contains("老師")) {
            sp_movie.setSelection(1);
        } else if (movie.contains("黑")) {
            sp_movie.setSelection(2);
        }else if (movie.contains("惡")) {
            sp_movie.setSelection(3);
        }else if (movie.contains("怪")) {
            sp_movie.setSelection(4);
        } else {
            sp_movie.setSelection(5);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ArrayList<String> list= new ArrayList<String>();
        ArrayList<String> list2= new ArrayList<String>();
        ArrayList<String> list3= new ArrayList<String>();
        String[] action;
        String[] action2;
        String[] action3;
        if (parent.getId() == R.id.spinner) {
            if (sp1.getSelectedItemPosition() == 0) {
                action = getResources().getStringArray(R.array.Taipei);
            } else {
                action = getResources().getStringArray(R.array.NewTaipei);
            }
            for (int j = 0; j < action.length; j++) {
                list.add(action[j]);
            }

            ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_gallery_item,list);
            adapter.setDropDownViewResource(android.R.layout.simple_gallery_item);
            sp2.setAdapter(adapter);
            } else if (parent.getId() == R.id.spinner2) {
            if (sp1.getSelectedItemPosition() == 0) {
                if (sp2.getSelectedItemPosition() == 0) {
                    action2 = getResources().getStringArray(R.array.CS);
                } else {
                    action2 = getResources().getStringArray(R.array.SS);
                }
                for (int j = 0; j < action2.length; j++) {
                    list2.add(action2[j]);
                }
            } else {
                if (sp2.getSelectedItemPosition() == 0) {
                    action2 = getResources().getStringArray(R.array.BC);
                } else {
                    action2 = getResources().getStringArray(R.array.LC);
                }

                for (int j = 0; j < action2.length; j++) {
                    list2.add(action2[j]);
                }
            }
            ArrayAdapter<String> adapter2=new ArrayAdapter(this,android.R.layout.simple_gallery_item,list2);
            adapter2.setDropDownViewResource(android.R.layout.simple_gallery_item);
            sp3.setAdapter(adapter2);
        } else if (parent.getId() == R.id.spinner4) {
            if (sp_movie.getSelectedItemPosition() == 0 || sp_movie.getSelectedItemPosition() == 1) {
                action3 = getResources().getStringArray(R.array.date1);
            } else if (sp_movie.getSelectedItemPosition() == 2 || sp_movie.getSelectedItemPosition() == 3) {
                action3 = getResources().getStringArray(R.array.date2);
            } else {
                action3 = getResources().getStringArray(R.array.date3);
            }
            for (int j = 0; j < action3.length; j++) {
                list3.add(action3[j]);
            }
            ArrayAdapter<String> adapter3=new ArrayAdapter(this,android.R.layout.simple_gallery_item,list3);
            adapter3.setDropDownViewResource(android.R.layout.simple_gallery_item);
            sp_date.setAdapter(adapter3);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkBox.isChecked()) {
            im.setVisibility(View.VISIBLE);
        } else
            im.setVisibility(View.GONE);
    }
    public void TextChange() {
        if (edt1.getText().toString().length() > 0 && edt2.getText().toString().length() > 0 && edt3.getText().toString().length() > 0) {
            cost = 220 * Integer.parseInt(edt1.getText().toString());
            if (edt1.getText().toString().length() > 0) {
                results = "您" + sp_date.getSelectedItem().toString()+", "+sp_time.getSelectedItem().toString()+",於"+
                        sp1.getSelectedItem().toString()+","+sp2.getSelectedItem().toString()+","+sp3.getSelectedItem().toString()+", 的電影「"+
                        sp_movie.getSelectedItem().toString() + "」共" + edt1.getText().toString()+"張, 座位為" + edt2.getText().toString() + "-" +
                        edt3.getText().toString() + "共" + cost + "元";
                position = sp1.getSelectedItem().toString()+""+sp2.getSelectedItem().toString()+""+sp3.getSelectedItem().toString();
            }
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        TextChange();
    }
    public void onclick(View v) {
            AlertDialog.Builder bdr = new AlertDialog.Builder(this);
        if (edt1.getText().toString().length()==0) {
            tv1.setText("請輸入人數！");
        }else
            tv1.setText("");
        if(edt2.getText().toString().length() == 0 || edt3.getText().toString().length() == 0){
            tv2.setText("請輸入座位代碼！");
        }else
            tv2.setText("");
        if(edt1.getText().toString().length() !=0 && edt2.getText().toString().length() !=0 && edt3.getText().toString().length() !=0) {
            bdr.setMessage("確定加入購物車嗎?");
            bdr.setTitle("電影票訂購");
            bdr.setIcon(android.R.drawable.btn_star_big_on);
            bdr.setNegativeButton("否", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity4.this, "請再確認您的訂購資訊！ 謝謝", Toast.LENGTH_LONG).show();
                }
            });
            bdr.setPositiveButton("是", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("result", results);
                    bundle.putString("position", position);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            bdr.setCancelable(true);
            bdr.show();
        }
    }
}