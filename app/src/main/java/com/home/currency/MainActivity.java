package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edNtd;
    private Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        edNtd = findViewById(R.id.ed_ntd);
        go = findViewById(R.id.go);
    }

    public void go(View view){
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = edNtd.getText().toString();
                if (TextUtils.isEmpty(n)){
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Problem")
                            .setMessage("Please enter your NTD amount")
                            .setPositiveButton("OK", null)
                            .show();
                }else{
                    float ntd = Float.parseFloat(n);
                    float go = ntd / 30.9f;
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Result")
                            .setMessage("USD is " + go)
                            .setPositiveButton("OK", null)
                            .show();
                }
            }
        });
        }
    }
