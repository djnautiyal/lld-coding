package com.learn.low_level_coding.online_auction_system;

public class Auction {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionMediator();

        Colleague bidder1 = new Bidder(auctionMediator, 1);
        Colleague bidder2 = new Bidder(auctionMediator, 2);
        Colleague bidder3 = new Bidder(auctionMediator, 3);

        auctionMediator.addColleagues(bidder1, bidder2, bidder3);

        bidder1.makeBid(100);
        bidder2.makeBid(200);
        bidder3.makeBid(300);
    }
}
