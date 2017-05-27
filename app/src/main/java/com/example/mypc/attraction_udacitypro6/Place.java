package com.example.mypc.attraction_udacitypro6;

/**
 * Created by shaimaalzahrani on 22/05/2017.
 */

public class Place {

    private String placeName;
    private Integer placeImageId;

    public Place(String placeName, Integer placeImageId) {
        this.placeName = placeName;
        this.placeImageId = placeImageId;
    }

    public Integer getPlaceImageId() {
        return placeImageId;
    }

    public void setPlaceImageId(Integer placeImageId) {
        this.placeImageId = placeImageId;
    }


    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }



}
