package com.learn.design_patterns.behavioural.observer.news_agency;

public class Broadcast {
    public static void main(String[] args) {
        EmailSubscriber e1 = new EmailSubscriber("email1");
        EmailSubscriber e2 = new EmailSubscriber("email2");
        EmailSubscriber e3 = new EmailSubscriber("email3");

        SMSSubscriber s1 = new SMSSubscriber("phone1");
        SMSSubscriber s2 = new SMSSubscriber("phone2");
        SMSSubscriber s3 = new SMSSubscriber("phone3");

        NewsPublisher p = new NewsPublisher();

        p.attach(e1);
        p.attach(e2);
        p.attach(e3);
        p.attach(s1);
        p.attach(s2);
        p.attach(s3);

        p.getLatestNews("ABC");
        p.getLatestNews("MNO");
        p.getLatestNews("XYZ");

        p.detach(s1);
        p.detach(e2);
        p.detach(s3);
        System.out.println();

        p.getLatestNews("PQR");
    }
}
