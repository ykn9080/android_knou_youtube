package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText et_test;
    private Button btn_test;
    private  Button  btn_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_test=findViewById(R.id.et_test);
        btn_test=findViewById(R.id.btn_test);
        btn_move=findViewById(R.id.btn_move);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_test.setText("this is first time");
            }
        });

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);

            }
        });
    }
}
