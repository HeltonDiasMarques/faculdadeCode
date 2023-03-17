package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class tela2 extends AppCompatActivity {
    private Button btnMostrar;
    private CheckBox chkFutebol, chkBasquete;
    private RadioButton rdbVespertino, rdbNoturno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        btnMostrar = findViewById(R.id.btnMostrar);
        chkFutebol = findViewById(R.id.chkFutebol);
        chkBasquete = findViewById(R.id.chkBasquete);
        rdbVespertino = findViewById(R.id.rdbVespertino);
        rdbNoturno = findViewById(R.id.rdbNoturno);
    }
    public void mostrar(View v){
        String status = "";
        if(chkFutebol.isChecked())
            status = status + "Futebol\n";
        if(chkBasquete.isChecked())
            status = status + "Basquete\n";
        if(rdbNoturno.isChecked())
            status = status + "Noturno\n";
        else if(rdbVespertino.isChecked())
            status = status + "Vespertino\n";


        Toast.makeText( this, status, Toast.LENGTH_LONG);

    }
}