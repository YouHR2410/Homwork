package com.example.chapter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn_change);
        final TextView tv1 =findViewById(R.id.tv1);
        final ImageView img2 = findViewById(R.id.image_view);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                tv1.setText("Lionel Messi !");
                img2.setBackgroundColor(150);
                Log.d(TAG, "you push the button!");
            }
        });
    }

}
