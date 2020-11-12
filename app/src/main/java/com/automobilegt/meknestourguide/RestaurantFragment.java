package com.automobilegt.meknestourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.automobilegt.meknestourguide.adapter.PlaceListAdapter;
import com.automobilegt.meknestourguide.data.Data;
import com.automobilegt.meknestourguide.model.Place;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    ArrayList<Place> restaurantList;
    public RestaurantFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        RecyclerView locationRecyclerView = rootView.findViewById(R.id.location_recyclerview);
        restaurantList = new ArrayList<>();
        Data data = new Data(getContext());
        restaurantList = data.getRestaurantList();
        PlaceListAdapter adapter = new PlaceListAdapter(restaurantList);
        locationRecyclerView.setAdapter(adapter);
        locationRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }
}