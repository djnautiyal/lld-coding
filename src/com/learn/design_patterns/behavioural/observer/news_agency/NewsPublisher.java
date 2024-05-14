package com.learn.design_patterns.behavioural.observer.news_agency;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    List<Subscriber> subscribers;
    String latestNews;

    NewsPublisher(){
        this.subscribers = new ArrayList<>();
        this.latestNews = null;
    }

    void attach(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    void detach(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    private void notifySubscribers(){
        for(Subscriber subscriber : subscribers){
            subscriber.update(latestNews);
        }
    }

    void getLatestNews(String news){
        latestNews = news;
        notifySubscribers();
    }

}

