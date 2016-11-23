package com.github.florent37.bubbletab.sample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FakeAdapter extends FragmentStatePagerAdapter {

    public FakeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;


        if (position == 0) {
            fragment = new FakeFragment();
        } else if (position == 1) {
            fragment = new FragmentTwo();
        }
        return fragment;
    }
    @Override
    public int getCount() {
        return 2;
    }
}
