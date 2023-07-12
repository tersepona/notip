package com.kimganteng.ali;

import static com.kimganteng.ali.SettingsAlien.BackupIntertitial;
import static com.kimganteng.ali.SettingsAlien.BackupReward;
import static com.kimganteng.ali.SettingsAlien.Backup_Initialize;
import static com.kimganteng.ali.SettingsAlien.MainIntertitial;
import static com.kimganteng.ali.SettingsAlien.MainRewards;
import static com.kimganteng.ali.SettingsAlien.Select_Backup_Ads;
import static com.kimganteng.ali.SettingsAlien.Select_Main_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aliendroid.alienads.KirimPesan;


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