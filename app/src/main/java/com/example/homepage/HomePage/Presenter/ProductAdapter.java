package com.example.homepage.HomePage.Presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.homepage.HomePage.Model.Product;
import com.example.homepage.R;

import java.util.List;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Context context;                    //this context will use to inflate the layout
    private List<Product> productList;          // storing all the products in a list

    public ProductAdapter(Context context, List<Product> productList) {     //getting the context and product list with constructor
        this.context = context;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_card_layout, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder productViewHolder, int position) {
        //getting the product of the specified position
        Product product = productList.get(position);

        //binding the data with the viewHolder views
        productViewHolder.productImage.setImageDrawable(context.getResources().getDrawable(product.getProductImage(), null));
        productViewHolder.productId.setText(product.getProductId());
        productViewHolder.checkStock.setText(product.getCheckStock());
        productViewHolder.productName.setText(product.getProductName());

//      First Button
        if (product.getFirstButton() == null) {
            productViewHolder.firstButton.setVisibility(View.GONE);
            productViewHolder.horLine1.setVisibility(View.GONE);
        } else {
            productViewHolder.firstButton.setText(product.getFirstButton());
        }

//      Second Button
        if (product.getSecondButton() == null) {
            productViewHolder.secondButton.setVisibility(View.GONE);
            productViewHolder.horLine1.setVisibility(View.GONE);
        } else {
            productViewHolder.secondButton.setText(product.getSecondButton());
        }

//      Third Button
        if (product.getThirdButton() == null) {
            productViewHolder.thirdButton.setVisibility(View.GONE);
            productViewHolder.horLine2.setVisibility(View.GONE);
        } else {
            productViewHolder.thirdButton.setText(product.getThirdButton());
        }

//      Fourth Button
        if (product.getFourthButton() == null) {
            productViewHolder.fourthButton.setVisibility(View.GONE);
            productViewHolder.horLine3.setVisibility(View.GONE);
        } else {
            productViewHolder.fourthButton.setText(product.getFourthButton());
        }

//      Fifth Button
        if (product.getFifthButton() == null) {
            productViewHolder.fifthButton.setVisibility(View.GONE);
            productViewHolder.horLine4.setVisibility(View.GONE);
        } else {
            productViewHolder.fifthButton.setText(product.getFifthButton());
        }

//      MRP
        productViewHolder.price.setText(String.valueOf(product.getPrice()));

//      MRP FirstRow
        if (product.getProductCount1() == null) {
            productViewHolder.mrpFirstRow.setVisibility(View.GONE);
        } else {
            productViewHolder.productCount1.setText(product.getProductCount1());
            productViewHolder.price1.setText(String.valueOf(product.getPrice1()));
            productViewHolder.discount1.setText(product.getDiscount1());
        }
//      MRP SecondRow
        if (product.getProductCount2() == null) {
            productViewHolder.mrpSecondRow.setVisibility(View.GONE);
        } else {
            productViewHolder.productCount2.setText(product.getProductCount2());
            productViewHolder.price2.setText(String.valueOf(product.getPrice2()));
            productViewHolder.discount2.setText(product.getDiscount2());
        }
//      MRP ThirdRow
        if (product.getProductCount3() == null) {
            productViewHolder.mrpThirdRow.setVisibility(View.GONE);
        } else {
            productViewHolder.productCount3.setText(product.getProductCount3());
            productViewHolder.price3.setText(String.valueOf(product.getPrice3()));
            productViewHolder.discount3.setText(product.getDiscount3());
        }
    }


    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {       // view holder class

        TextView productId, checkStock, productName, productCount1, productCount2, productCount3, discount1, discount2, discount3, price, price1, price2, price3;
        Button firstButton, secondButton, thirdButton, fourthButton, fifthButton;
        ImageView productImage;
        View horLine1, horLine2, horLine3, horLine4;
        LinearLayout mrpFirstRow,mrpSecondRow,mrpThirdRow;

        public ProductViewHolder(View itemView) {
            super(itemView);

            productId = itemView.findViewById(R.id.tvProductId);
            checkStock = itemView.findViewById(R.id.tvCheckStock);
            productName = itemView.findViewById(R.id.tvProductName);
            productCount1 = itemView.findViewById(R.id.tvProductCount1);
            productCount2 = itemView.findViewById(R.id.tvProductCount2);
            productCount3 = itemView.findViewById(R.id.tvProductCount3);
            discount1 = itemView.findViewById(R.id.tvDiscount1);
            discount2 = itemView.findViewById(R.id.tvDiscount2);
            discount3 = itemView.findViewById(R.id.tvDiscount3);
            price = itemView.findViewById(R.id.tvPrice);
            price1 = itemView.findViewById(R.id.tvPrice1);
            price2 = itemView.findViewById(R.id.tvPrice2);
            price3 = itemView.findViewById(R.id.tvPrice3);
            firstButton = itemView.findViewById(R.id.btnProduct1);
            secondButton = itemView.findViewById(R.id.btnProduct2);
            thirdButton = itemView.findViewById(R.id.btnProduct3);
            fourthButton = itemView.findViewById(R.id.btnProduct4);
            fifthButton = itemView.findViewById(R.id.btnProduct5);
            productImage = itemView.findViewById(R.id.ivProductImage);
            horLine1 = itemView.findViewById(R.id.vHorizontalBar1);
            horLine2 = itemView.findViewById(R.id.vHorizontalBar2);
            horLine3 = itemView.findViewById(R.id.vHorizontalBar3);
            horLine4 = itemView.findViewById(R.id.vHorizontalBar4);
            mrpFirstRow = itemView.findViewById(R.id.mrpFirstRowLayout);
            mrpSecondRow = itemView.findViewById(R.id.mrpSecondRowLayout);
            mrpThirdRow = itemView.findViewById(R.id.mrpThirdRowLayout);
        }
    }
}