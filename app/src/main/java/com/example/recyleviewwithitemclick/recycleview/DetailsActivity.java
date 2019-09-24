package com.example.recyleviewwithitemclick.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyleviewwithitemclick.R;

public class DetailsActivity extends AppCompatActivity {
    private int image;
    private String name,code;
    private String price;
    private ImageView imageView;
    private TextView nameTV,priceTV,codeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        init();

        if (getIntent().getExtras()!=null){

            image =getIntent().getIntExtra("image",0);
            name= getIntent().getStringExtra("name");
            price= getIntent().getStringExtra("price");
            code= getIntent().getStringExtra("code");

        }

        imageView.setImageResource(image);
        nameTV.setText(name);
        priceTV.setText(price);
        codeTV.setText(code);
    }

    private void init() {
        imageView= findViewById(R.id.imagedetailtsIV);
        nameTV= findViewById(R.id.nameTV);
        priceTV= findViewById(R.id.productPrizeTV);
        codeTV= findViewById(R.id.codeTV);

    }
}
