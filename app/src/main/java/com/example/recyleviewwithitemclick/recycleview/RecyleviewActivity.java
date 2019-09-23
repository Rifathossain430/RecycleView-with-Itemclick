package com.example.recyleviewwithitemclick.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyleviewwithitemclick.R;

import java.util.ArrayList;
import java.util.List;

public class RecyleviewActivity extends AppCompatActivity {
    private List<Product> products;
    private ProductAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyleview);
        init();
        getProductList();
        getRecycleVIew();
    }



    private void init() {
        products = new ArrayList<>();
        recyclerView = findViewById(R.id.rv);
        adapter = new ProductAdapter(products);
    }

    private void getProductList() {
        Product product1 = new Product(R.drawable.rice, 52, "Rice", "rice01");
        Product product2 = new Product(R.drawable.dal, 85, "Dal", "dal01");
        Product product3 = new Product(R.drawable.oil, 100, "Oil", "oil01");
        Product product4 = new Product(R.drawable.masala, 450, "Masala", "masala01");
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);


    }
    private void getRecycleVIew() {
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);
    }


}
