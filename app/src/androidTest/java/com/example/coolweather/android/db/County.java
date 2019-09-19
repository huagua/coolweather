package com.example.coolweather.android.db;

public class County {
    private int id;
    private int weatherId;
    private String countryName;
    private int cityId;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getweatherId()
    {
        return weatherId;
    }

    public void setWeatherId(int weatherId)
    {
        this.weatherId = weatherId;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public int getCityId()
    {
        return cityId;
    }

    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }



}
