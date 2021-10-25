package com.example.tourguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private CollapsingToolbarLayout collapsingToolbar;
    private OverviewFragment overviewFragment;
    private PharaonicFragment pharaonicFragment;
    private CopticFragment copticFragment;
    private IslamicFragment islamicFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        collapsingToolbar = findViewById(R.id.collapsing_toolbar);

        overviewFragment = new OverviewFragment();
        pharaonicFragment = new PharaonicFragment();
        copticFragment = new CopticFragment();
        islamicFragment = new IslamicFragment();

        setSupportActionBar(toolbar);
        collapsingToolbar.setTitle(getString(R.string.title));
        tabLayout.setupWithViewPager(viewPager);

        viewPagerAdapter adapter = new viewPagerAdapter(getSupportFragmentManager(), 0);

        adapter.addFragment(overviewFragment, getString(R.string.overview));
        adapter.addFragment(pharaonicFragment, getString(R.string.pharao));
        adapter.addFragment(copticFragment, getString(R.string.copty));
        adapter.addFragment(islamicFragment, getString(R.string.islam));

        viewPager.setAdapter(adapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_explore_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_photo_size_select_actual_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_add_alert_24);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_baseline_brightness_4_24);

    }

}