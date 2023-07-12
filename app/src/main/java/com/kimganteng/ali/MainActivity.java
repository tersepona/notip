package com.kimganteng.ali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ali.notip.KirimPesan;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        KirimPesan.Siapkirim("JANGAN");



    }



    public void onBackPressed(){
        finishAffinity();
        System.exit(0);
    }
}