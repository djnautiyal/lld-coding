package com.learn.design_patterns.behavioural.observer.news_agency;

public interface Subscriber {
    public void update(String news);
}

class EmailSubscriber implements Subscriber {
    String email;

    public EmailSubscriber(String email){ this.email = email; }
    @Override
    public void update(String news) {
        System.out.println("Email: " + email + " received the news:" + news);
    }
}

class SMSSubscriber implements Subscriber {
    String phone;

    public SMSSubscriber(String phone){ this.phone = phone; }

    @Override
    public void update(String news) {
        System.out.println("SMS: " + phone + " received the news:" + news);
    }
}
