package com.automobilegt.meknestourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.automobilegt.meknestourguide.adapter.AttractionListAdapter;
import com.automobilegt.meknestourguide.data.Data;
import com.automobilegt.meknestourguide.interfaces.ListItemClickListener;
import com.automobilegt.meknestourguide.model.Place;

import java.util.ArrayList;

import static com.automobilegt.meknestourguide.DetailFragment.newDetailFragment;

public class EventFragment extends Fragment implements ListItemClickListener{
    ArrayList<Place> eventList;
    public EventFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        RecyclerView locationRecyclerView = rootView.findViewById(R.id.location_recyclerview);
        eventList = new ArrayList<>();
        Data data = new Data(getContext());
        eventList = data.getEventList();
        AttractionListAdapter adapter = new AttractionListAdapter(eventList, this);
        locationRecyclerView.setAdapter(adapter);
        locationRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        Fragment fragment = newDetailFragment(eventList.get(clickedItemIndex).getPlaceName(), eventList.get(clickedItemIndex).getPlacePhoto(), eventList.get(clickedItemIndex).getPlaceDetail());
        assert getFragmentManager() != null;
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null).commit();
    }
}