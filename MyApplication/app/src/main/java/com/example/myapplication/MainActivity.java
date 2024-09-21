package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.home).setOnClickListener(this);
        findViewById(R.id.changshang).setOnClickListener(this);
        findViewById(R.id.chanpin).setOnClickListener(this);
       findViewById(R.id.zhanhui).setOnClickListener(this);
         findViewById(R.id.zhaopin).setOnClickListener(this);
        findViewById(R.id.ruzhu).setOnClickListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.home){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();
        } else if (view.getId() ==R.id.changshang) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new ChangshangFragment()).commit();
        } else if (view.getId() ==R.id.chanpin) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new ChanpinFragment()).commit();
        } else if (view.getId() == R.id.zhanhui) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new ZhanhuiFragment()).commit();
        } else if (view.getId() == R.id.zhaopin) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new ZhaopinFragment()).commit();
        } else if (view.getId() == R.id.ruzhu) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new RuzhuFragment()).commit();
        }
    }
}