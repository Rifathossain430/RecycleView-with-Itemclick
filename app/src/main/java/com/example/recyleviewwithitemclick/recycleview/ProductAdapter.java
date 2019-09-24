package com.example.recyleviewwithitemclick.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyleviewwithitemclick.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Product> products;
    private Context mcontext;

    public ProductAdapter(List<Product> products) {
        this.products = products;
    }

    public ProductAdapter(List<Product> products, Context mcontext) {
        this.products = products;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.productitemview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Product product= products.get(position);
        holder.image.setImageResource(product.getProductImage());
        holder.name.setText(product.getProductName());
        holder.price.setText(String.valueOf(product.getProductPrize()));
        holder.code.setText(product.getProductCode());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mcontext,DetailsActivity.class);
                intent.putExtra("name",product.getProductName());
                intent.putExtra("image",product.getProductImage());
                intent.putExtra("code",product.getProductCode());
                intent.putExtra("price",product.getProductPrize());
                mcontext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name,price,code;
        private CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.productImageIV);
            name= itemView.findViewById(R.id.productNameTV);
            price= itemView.findViewById(R.id.productPrizeTV);
            code= itemView.findViewById(R.id.productcodeTV);
            cardView= itemView.findViewById(R.id.cardview);
        }
    }
}
