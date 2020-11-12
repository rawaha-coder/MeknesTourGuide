package com.automobilegt.meknestourguide.data;

import android.content.Context;

import com.automobilegt.meknestourguide.R;
import com.automobilegt.meknestourguide.model.Place;

import java.util.ArrayList;

public class Data {

   private Context context;

    public Data(Context context) {
        this.context = context;
    }

    public ArrayList<Place> getEventList(){
        ArrayList<Place> eventList = new ArrayList<>();
        eventList.add(new Place(R.drawable.event_siam, context.getString(R.string.event_name_SIAM) , context.getString(R.string.event_detail_SIAM)));
        eventList.add(new Place(R.drawable.event_viftwm, context.getString(R.string.event_name_VIFTWM) , context.getString(R.string.event_detail_VIFTWM)));
        eventList.add(new Place(null, context.getString(R.string.event_name_MIF) , context.getString(R.string.event_detail_MIF)));
        return eventList;
    }

    public ArrayList<Place> getAttractionsList(){
        ArrayList<Place> attractionsList = new ArrayList<>();
        attractionsList.add(new Place(R.drawable.attraction_volubilis, context.getString(R.string.attraction_name_Volubilis), context.getString(R.string.attraction_detail_Volubilis)));
        attractionsList.add(new Place(R.drawable.attraction_bab_mansour, context.getString(R.string.attraction_name_BabMansour), context.getString(R.string.attraction_detail_BabMansour)));
        attractionsList.add(new Place(null, context.getString(R.string.attraction_name_PlaceHedim), context.getString(R.string.attraction_detail_PlaceHedim)));
        attractionsList.add(new Place(R.drawable.attraction_heri_es_souani, context.getString(R.string.attraction_name_HeriEsSouani), context.getString(R.string.attraction_detail_HeriEsSouani)));
        return attractionsList;
    }

    public ArrayList<Place> getHotelsList(){
        ArrayList<Place> hotelsList = new ArrayList<>();
        hotelsList.add(new Place(R.drawable.hotel_zaki, context.getString(R.string.place_name_HotelZaki) , context.getString(R.string.place_phone_HotelZaki), context.getString(R.string.place_address_HotelZaki)));
        hotelsList.add(new Place(R.drawable.hotel_ibis, context.getString(R.string.place_name_HotelIbis) , context.getString(R.string.place_phone_HotelIbis), context.getString(R.string.place_address_HotelIbis)));
        hotelsList.add(new Place(R.drawable.hotel_menzeh_dalia, context.getString(R.string.place_name_HotelMenzehDalia) , context.getString(R.string.place_phone_HotelMenzehDalia), context.getString(R.string.place_address_HotelMenzehDalia)));
        hotelsList.add(new Place(R.drawable.hotel_transatlantique, context.getString(R.string.place_name_HotelTransatlantique) , context.getString(R.string.place_phone_HotelTransatlantique), context.getString(R.string.place_address_HotelTransatlantique)));
        return hotelsList;
    }

    public ArrayList<Place> getRestaurantList(){
        ArrayList<Place> restaurantList = new ArrayList<>();
        restaurantList.add(new Place(R.drawable.restaurant_baraka, context.getString(R.string.place_name_RestaurantBaraka) , context.getString(R.string.place_phone_RestaurantBaraka), context.getString(R.string.place_address_RestaurantBaraka)));
        restaurantList.add(new Place(R.drawable.restaurant_gout_de_meknes, context.getString(R.string.place_name_RestaurantGoutDeMeknes) , context.getString(R.string.place_phone_RestaurantGoutDeMeknes), context.getString(R.string.place_address_RestaurantGoutDeMeknes)));
        restaurantList.add(new Place(null, context.getString(R.string.place_name_RestaurantLaGrillardiere) , context.getString(R.string.place_phone_RestaurantLaGrillardiere), context.getString(R.string.place_address_RestaurantLaGrillardiere)));
        restaurantList.add(new Place(R.drawable.restaurant_ya_haha_meknes, context.getString(R.string.place_name_RestaurantYAHalaMeknes) , context.getString(R.string.place_phone_RestaurantYAHalaMeknes), context.getString(R.string.place_address_RestaurantYAHalaMeknes)));
        return restaurantList;
    }
}
