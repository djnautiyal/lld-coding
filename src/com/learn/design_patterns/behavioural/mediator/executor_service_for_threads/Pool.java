package com.learn.design_patterns.behavioural.mediator.executor_service_for_threads;

import java.util.ArrayList;
import java.util.List;

public class Pool {
    List<Thread> threads;

    Pool(){
        this.threads = new ArrayList<>();
    }

    void addToPool(Thread thread){
        this.threads.add(thread);
        thread.addToPool(this);
    }

    void execute(Thread thread){
//        thread.execute();
        threads.stream()
                .filter(x -> x != thread)
                .forEach(Thread::idle);
    }

    public void removeFromPool(Thread thread) {
        threads.remove(thread);
    }

    @Override
    public String toString() {
        StringBuilder pool = new StringBuilder("Pool: [");

        threads.stream()
                .forEach(pool::append);

        pool.append(" ]");
        return pool.toString();
    }

}
