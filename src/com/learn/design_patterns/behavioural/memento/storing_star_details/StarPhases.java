package com.learn.design_patterns.behavioural.memento.storing_star_details;

import java.util.ArrayDeque;
import java.util.Deque;

public class StarPhases {
    public static void main(String[] args) {
        Deque<StarMemento> states = new ArrayDeque<>();

        var star = new Star(0, StarType.SUN, 10);

        System.out.println(star);
        states.push(star.getMemento());

        star.timePasses();
        System.out.println(star);
        states.push(star.getMemento());

        star.timePasses();
        System.out.println(star);
        states.push(star.getMemento());

        star.timePasses();
        System.out.println(star);
        states.push(star.getMemento());

        star.timePasses();
        System.out.println(star);
        states.push(star.getMemento());

        System.out.println("Let's peel the layer backward");
        while(!states.isEmpty()){
            star.setMemento(states.pop());
            System.out.println(star);
        }


    }
}
