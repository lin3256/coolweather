package com.coolweather.android.db;

/**
 * Created by lin on 2017/8/23.
 */

public class Country {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
