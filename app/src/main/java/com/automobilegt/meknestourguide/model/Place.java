package com.automobilegt.meknestourguide.model;

import androidx.annotation.Nullable;

public class Place {
    private int placePhoto;
    private String placeName;
    private String placeAddress;
    private String placePhoneNumber;
    private String placeDetail;

    public Place(@Nullable Integer placePhoto, String placeName, String placePhoneNumber, String placeAddress) {
        if (placePhoto != null){
            this.placePhoto = placePhoto;
        }else {
            this.placePhoto = 0;
        }
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.placePhoneNumber = placePhoneNumber;
    }

    public Place(@Nullable Integer placePhoto, String placeName, String placeDetail) {
        if (placePhoto != null){
            this.placePhoto = placePhoto;
        }else {
            this.placePhoto = 0;
        }
        this.placeName = placeName;
        this.placeDetail = placeDetail;
    }

    public int getPlacePhoto() {
        return placePhoto;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public String getPlacePhoneNumber() {
        return placePhoneNumber;
    }

    public String getPlaceDetail() {
        return placeDetail;
    }
}
