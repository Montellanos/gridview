package com.factorybyte.scrollview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Adapter;

import com.factorybyte.scrollview.Adapters.TabsFragmentAdapter;
import com.factorybyte.scrollview.Fragments.AFragment;
import com.factorybyte.scrollview.Fragments.BFragment;
import com.factorybyte.scrollview.Fragments.CFragment;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabs;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);



        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);










}

    private void setupViewPager(ViewPager viewPager) {

        TabsFragmentAdapter tabsAdapter =  new TabsFragmentAdapter(getSupportFragmentManager());

        tabsAdapter.addFragment(new AFragment(), "A");
        tabsAdapter.addFragment(new BFragment(), "B");
        tabsAdapter.addFragment(new CFragment(), "C");
        viewPager.setAdapter(tabsAdapter);


    }
}
