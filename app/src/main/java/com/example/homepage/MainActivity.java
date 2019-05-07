package com.example.homepage;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Chronometer;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.homepage.HomePage.Model.Product;
import com.example.homepage.HomePage.Presenter.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Toolbar homeToolbar;
    private Chronometer chronometer;
    private long pauseOffSet;
    private boolean running;
    RecyclerView recyclerView;
    ProductAdapter productAdapter;
    List<Product> productList;

    String[] catalogue={"Select Catalogue","All","Focus Articles","Investment Articles"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeToolbar = (Toolbar) findViewById(R.id.homeToolbar);
        setSupportActionBar(homeToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        chronometer = findViewById(R.id.chronometer);
        startChronometer();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();  //initializing the productlist

        //adding some items to our list
        productList.add(new Product(R.drawable.ic_launcher_background, "1234", "stock", "ProductName", null, "200ml", "300ml",
                "400ml", null, "1+", null, "35+", "1% off", "15% off", "20% off", 5000, 6000, 7000, 8000));


        productAdapter = new ProductAdapter(this, productList);   //creating recyclerView adapter
        recyclerView.setAdapter(productAdapter);                         //setting adapter to recyclerView


        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),catalogue);
        spin.setAdapter(customAdapter);
    }


    public void startChronometer() {
        if (!running) {
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffSet);
            chronometer.start();
            running = true;
        }
    }

    public void pauseChronometer(View view) {
        if (running) {
            chronometer.stop();
            pauseOffSet = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
        }
    }

    public void resetChronometer(View view) {
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffSet = 0;
    }

    public void searchActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), SearchPage.class);
        startActivity(intent);
    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
       Toast.makeText(getApplicationContext(), catalogue[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
