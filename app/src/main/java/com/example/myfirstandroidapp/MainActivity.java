package com.example.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.tv_text1);
        text.setText("hellow mellow daddy again");
        Button change = findViewById(R.id.btn_change);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Din daddy er nu emil");
                text.setTextSize(32);
                text.setTextColor(ContextCompat.getColor(v.getContext(), R.color.darkred));
            }
        });
    }
}