package com.learn.design_patterns.behavioural.observer.orcs_and_hobbits_watch_weather;

public enum WeatherType {

    SUNNY("Sunny"), RAINY("Rainy"), WINDY("Windy"), SNOWY("Snowy"), FOGGY("Foggy"), CLOUDY("Cloudy"), STORMY("Stormy"), HOT("HOT"), COLD("COLD");

    private final String weatherType;

    WeatherType(String weatherType){
        this.weatherType = weatherType;
    }

    @Override
    public String toString(){
        return weatherType;
    }
}
