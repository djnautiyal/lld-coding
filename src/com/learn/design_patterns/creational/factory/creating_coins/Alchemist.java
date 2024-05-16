package com.learn.design_patterns.creational.factory.creating_coins;

public class Alchemist {
    public static void main(String[] args) {
        Coin coin = CoinFactory.getCoin(CoinType.COPPER);
        System.out.println(coin.getDescription());

        coin = CoinFactory.getCoin(CoinType.GOLD);
        System.out.println(coin.getDescription());
    }
}
