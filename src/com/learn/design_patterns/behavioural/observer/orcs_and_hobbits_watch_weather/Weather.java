package com.learn.design_patterns.behavioural.observer.orcs_and_hobbits_watch_weather;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;
    private final List<WeatherObserver> observerList;

    public Weather () {
        currentWeather = WeatherType.SUNNY;
        observerList = new ArrayList<>();
    }

    public void addObserver(WeatherObserver observer) {
        observerList.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observerList.remove(observer);
    }

    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather has changed to: " + currentWeather);

        notifyObservers();
    }
    private void notifyObservers() {
        for (var observer : observerList) {
            observer.update(currentWeather);
        }
    }

    public static void main(String[] args) {
        var weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
