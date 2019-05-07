package com.example.homepage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class SearchPage extends AppCompatActivity {
    private Toolbar homeToolbar;
    LinearLayout toolBarStoreNameLayout;
    ImageButton imgBackBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        homeToolbar = (Toolbar) findViewById(R.id.homeToolbar);
        imgBackBtn = (ImageButton)findViewById(R.id.imgBtnBack);
        toolBarStoreNameLayout = (LinearLayout)findViewById(R.id.toolbarStoreNameLayout);

        setSupportActionBar(homeToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolBarStoreNameLayout.setVisibility(View.GONE);
        imgBackBtn.setVisibility(View.GONE);
        homeToolbar.setTitle("Search");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        homeToolbar.setNavigationIcon(R.drawable.ic_blue_back_arrow);
    }
}
