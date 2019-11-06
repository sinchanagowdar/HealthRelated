package com.example.hackthon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class SecondActivity1 extends AppCompatActivity {


    private TabLayout tabLayout;

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);

        /*
        Adding toolbar to the activity
        Initializing the tablayout
        */



        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        tabLayout.addTab(tabLayout.newTab().setText("A+"));
        tabLayout.addTab(tabLayout.newTab().setText("B+"));
        tabLayout.addTab(tabLayout.newTab().setText("O+"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        viewPager = (ViewPager) findViewById(R.id.pager);


        Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());

        /* Adding adapter to pager */
        viewPager.setAdapter(adapter);

        /* Adding onTabSelectedListener to swipe views */
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}