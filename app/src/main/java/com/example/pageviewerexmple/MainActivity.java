package com.example.pageviewerexmple;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static int num_Pages=2;
    private ViewPager2 viewPager2;
    private FragmentStateAdapter pagerAdabter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.pager);
        pagerAdabter=new ScreenSlidePageAdapter(this);
        viewPager2.setAdapter(pagerAdabter);
    }

    private class ScreenSlidePageAdapter extends FragmentStateAdapter {
        public ScreenSlidePageAdapter(MainActivity mainActivity) {
            super(mainActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                return new Fragment1();
                case 1:
                    return new Fragment2();
                default:
                    return null;
            }
        }

        @Override
        public int getItemCount() {
            return num_Pages;
        }
    }
}