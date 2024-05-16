package com.learn.design_patterns.creational.factory.creating_coins;


/*
In CoinFactory.java, the getCoin method takes a CoinType as a parameter.
It then uses the getConstructor method of the CoinType to retrieve a Supplier that can create an instance of the specified coin type.
Finally, it calls the get method on the retrieved Supplier to create and return an instance of the requested coin type.

So, CoinFactory.java is using CoinType.java to dynamically create instances of different types of coins based on the CoinType enum passed to the getCoin method.
 */
public class CoinFactory {
    public static Coin getCoin(CoinType coinType) {
        return coinType.getConstructor().get();
    }
}
