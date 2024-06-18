package com.learn.low_level_coding.online_auction_system;

public interface Colleague {
    void makeBid(int amount);
    void receiveBid(Colleague colleague, int amount);
}

class Bidder implements Colleague {
    private Mediator mediator;
    private int index;

    public Bidder(Mediator mediator, int index) {
        this.mediator = mediator;
        this.index = index;
    }

    @Override
    public void makeBid(int amount) {
        mediator.receiveBid(this, amount);
    }

    @Override
    public void receiveBid(Colleague colleague, int amount) {
        System.out.println(this + "got a notification that " + colleague + " made a bid of " + amount);
    }

    @Override
    public String toString() {
        return "Bidder{" + "index=" + index + '}';
    }
}

