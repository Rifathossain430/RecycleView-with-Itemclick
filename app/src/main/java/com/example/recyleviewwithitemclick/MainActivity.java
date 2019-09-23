package com.example.recyleviewwithitemclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recyleviewwithitemclick.recycleview.RecyleviewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void recycleviewactivity(View view) {
        startActivity(new Intent(this, RecyleviewActivity.class));
    }
}
