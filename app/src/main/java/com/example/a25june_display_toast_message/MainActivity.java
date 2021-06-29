package com.example.a25june_display_toast_message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnOne;
    private Button mBtnTwo;
    private Button mBtnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnOne = findViewById(R.id.mBtnOne);
        mBtnTwo = findViewById(R.id.mBtnTwo);
        mBtnThree = findViewById(R.id.mBtnThree);

        mBtnOne.setOnClickListener(this);
        mBtnTwo.setOnClickListener(this);
        mBtnThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id  = v.getId();
        switch (id){
            case R.id.mBtnOne:
                Toast.makeText(MainActivity.this,"Button One clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBtnTwo:
                Toast.makeText(MainActivity.this,"Button Two clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBtnThree:
                Toast.makeText(MainActivity.this,"Button Three clicked",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}