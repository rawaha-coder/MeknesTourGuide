package com.automobilegt.meknestourguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.automobilegt.meknestourguide.R;
import com.automobilegt.meknestourguide.model.Place;

import java.util.ArrayList;

public class PlaceListAdapter extends RecyclerView.Adapter<PlaceListAdapter.ViewHolder>{
    ArrayList<Place> placeList;

    public PlaceListAdapter(ArrayList<Place> placeList) {
        this.placeList = placeList;
    }

    @NonNull
    @Override
    public PlaceListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rv_places_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceListAdapter.ViewHolder holder, int position) {
        Place place = placeList.get(position);
        if (place.getPlacePhoto() != 0){
            holder.placePhoto.setImageResource(place.getPlacePhoto());
        }else{
            holder.placePhoto.setVisibility(View.GONE);
        }
        holder.placeName.setText(place.getPlaceName());
        holder.placePhoneNumber.setText(place.getPlacePhoneNumber());
        holder.placeAddress.setText(place.getPlaceAddress());
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView placePhoto;
        TextView placeName;
        TextView placePhoneNumber;
        TextView placeAddress;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            placePhoto = itemView.findViewById(R.id.rv_row_place_photo);
            placeName = itemView.findViewById(R.id.rv_row_place_name);
            placePhoneNumber = itemView.findViewById(R.id.rv_row_place_phone_number);
            placeAddress = itemView.findViewById(R.id.rv_row_place_address);
        }
    }
}
