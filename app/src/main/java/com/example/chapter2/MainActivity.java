package com.example.chapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","on create");
        Button btn1 = findViewById(R.id.btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"button click",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn2 =findViewById(R.id.btn1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
        Button btn3 =findViewById(R.id.btn2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, My_activity.class); startActivity(intent);
                startActivity(intent);
            }
        });
        Button btn4 =findViewById(R.id.btn3);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL_BUTTON);
                startActivity(intent);
            }
        });
        Button btn5 =findViewById(R.id.btn4);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, search.class); startActivity(intent);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivity","on start");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivity","on resume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivity","on pause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivity","on stop");
    }
    protected void onDestory(){
        super.onDestroy();
        Log.i("MainActivity","on destory");
    }

}
