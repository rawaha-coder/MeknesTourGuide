package com.automobilegt.meknestourguide.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.automobilegt.meknestourguide.HotelFragment;
import com.automobilegt.meknestourguide.RestaurantFragment;
import com.automobilegt.meknestourguide.EventFragment;
import com.automobilegt.meknestourguide.AttractionFragment;
import com.automobilegt.meknestourguide.R;

public class LocationViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    public LocationViewPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new AttractionFragment();
        }else if (position == 1){
            return new HotelFragment();
        }else if (position == 2){
            return new RestaurantFragment();
        }else {
            return new EventFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return context.getString(R.string.tab_attractions);
        }else if (position == 1){
            return context.getString(R.string.tab_hotels);
        }else if (position == 2){
            return context.getString(R.string.tab_restaurants);
        }else {
            return context.getString(R.string.tab_events);
        }
    }
}
