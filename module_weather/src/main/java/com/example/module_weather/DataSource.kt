package com.example.module_weather

import com.example.module_weather.entity.ResponseMsg
import com.example.module_weather.entity.weather.ResponseWeatherData
import io.reactivex.Observable

/**
 * @author
 * @Date 2018/12/30
 * @description
 * @since 1.0.0
 */
interface DataSource {

    fun queryWeather(cityname: String): Observable<ResponseMsg<ResponseWeatherData>>
}