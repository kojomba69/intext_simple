package com.sunny.www.intext_simple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonfirst=findViewById(R.id.buttonfirst);
        buttonfirst.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        intent = new Intent(this,secondactiviy.class);
        startActivity(intent);
    }
}
