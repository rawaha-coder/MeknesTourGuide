package com.automobilegt.meknestourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    private static final String ARG_TITLE = "title";
    private static final String ARG_PHOTO = "photo";
    private static final String ARG_DETAIL = "text";

    private String mTitle;
    private String mTextDetail;
    private int mPhotoResId;

    public DetailFragment() {
    }

    public static DetailFragment newDetailFragment(String title, int photoId, String textDetail) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putInt(ARG_PHOTO, photoId);
        args.putString(ARG_DETAIL, textDetail);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTitle = getArguments().getString(ARG_TITLE);
            mTextDetail = getArguments().getString(ARG_DETAIL);
            mPhotoResId = getArguments().getInt(ARG_PHOTO);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView tvTitleDetail = rootView.findViewById(R.id.tv_title_detail_fragment);
        TextView tvTextDetail = rootView.findViewById(R.id.tv_text_detail_fragment);
        ImageView ivPhotoDetail = rootView.findViewById(R.id.iv_photo_detail_fragment);
        ImageView ivArrowBack = rootView.findViewById(R.id.iv_arrow_back_detail_fragment);
        tvTitleDetail.setText(mTitle);
        tvTextDetail.setText(mTextDetail);
        if(mPhotoResId != 0){
            ivPhotoDetail.setImageResource(mPhotoResId);
        }else {
            ivPhotoDetail.setVisibility(View.INVISIBLE);
        }

        ivArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assert getFragmentManager() != null;
                getFragmentManager().popBackStack();
            }
        });
        return rootView;
    }
}