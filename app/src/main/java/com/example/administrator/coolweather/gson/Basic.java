package com.example.administrator.coolweather.gson;



import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/12/30.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String cityId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
