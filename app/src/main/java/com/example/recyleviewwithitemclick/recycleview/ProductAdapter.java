package com.example.recyleviewwithitemclick.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyleviewwithitemclick.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Product> products;

    public ProductAdapter(List<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.productitemview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product= products.get(position);
        holder.image.setImageResource(product.getProductImage());
        holder.name.setText(product.getProductName());
        holder.price.setText(String.valueOf(product.getProductPrize()));
        holder.code.setText(product.getProductCode());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name,price,code;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.productImageIV);
            name= itemView.findViewById(R.id.productNameTV);
            price= itemView.findViewById(R.id.productPrizeTV);
            code= itemView.findViewById(R.id.productcodeTV);
        }
    }
}
