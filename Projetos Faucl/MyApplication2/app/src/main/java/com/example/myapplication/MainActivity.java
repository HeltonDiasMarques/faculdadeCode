package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTela1, btnTela2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTela1 = findViewById(R.id.btnTela1);
        btnTela2 = findViewById(R.id.btnTela2);

    }
    public void tela1(View v){
        Intent it = new Intent(this, tela2.class);
        startActivity(it);
    }
}