package com.automobilegt.meknestourguide.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.automobilegt.meknestourguide.R;
import com.automobilegt.meknestourguide.interfaces.ListItemClickListener;
import com.automobilegt.meknestourguide.model.Place;

import java.util.ArrayList;

public class AttractionListAdapter extends RecyclerView.Adapter<AttractionListAdapter.ViewHolder> implements ListItemClickListener{
    ArrayList<Place> attractionList;
    ListItemClickListener onClickListener;

    public AttractionListAdapter(ArrayList<Place> attractionList, ListItemClickListener onClickListener) {
        this.attractionList = attractionList;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public AttractionListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.rv_attraction_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttractionListAdapter.ViewHolder holder, int position) {
        Place attractionPlace = attractionList.get(position);
        if (attractionPlace.getPlacePhoto() != 0){
            holder.attractionPhoto.setImageResource(attractionPlace.getPlacePhoto());
        }else{
            holder.attractionPhoto.setVisibility(View.GONE);
        }
        holder.attractionName.setText(attractionPlace.getPlaceName());
        String text = TextUtils.substring(attractionPlace.getPlaceDetail(), 0, 150);
        holder.attractionDetail.setText(text);
    }

    @Override
    public int getItemCount() {
        return attractionList.size();
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView attractionPhoto;
        TextView attractionName;
        TextView attractionDetail;
        Button readMore;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            attractionPhoto = itemView.findViewById(R.id.rv_row_attraction_photo);
            attractionName = itemView.findViewById(R.id.rv_row_attraction_name);
            attractionDetail = itemView.findViewById(R.id.rv_row_attraction_detail);
            readMore = itemView.findViewById(R.id.rv_row_read_more);
            readMore.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onListItemClick(getAdapterPosition());
        }
    }
}
