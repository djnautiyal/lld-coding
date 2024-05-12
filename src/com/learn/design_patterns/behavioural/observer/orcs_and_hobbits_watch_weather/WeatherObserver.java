package com.learn.design_patterns.behavioural.observer.orcs_and_hobbits_watch_weather;

public interface WeatherObserver {
    void update(WeatherType weatherType);
}

class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The orcs are facing " + weatherType + " right now");
    }
}

class Hobbits implements WeatherObserver {
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The hobbits are facing " + weatherType + " right now");
    }
}