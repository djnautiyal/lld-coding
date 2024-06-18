package com.learn.low_level_coding.online_auction_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Mediator {
    void addColleague(Colleague colleague);
    void addColleagues(Colleague... colleagues);
    void receiveBid(Colleague colleague, int amount);
}

class AuctionMediator implements Mediator {
    List<Colleague> colleagues;

    public AuctionMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void addColleagues(Colleague... colleagues) {
        this.colleagues.addAll(Arrays.asList(colleagues));
    }

    @Override
    public void receiveBid(Colleague colleague, int amount) {
        System.out.println(colleague + " made a bid of: " + amount);
        for(Colleague c : colleagues) {
            if(c != colleague) {
                c.receiveBid(colleague, amount);
            }
        }
    }
}