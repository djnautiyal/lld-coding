package com.learn.design_patterns.behavioural.mediator.executor_service_for_threads;

public abstract class Thread {
    Pool pool;
    void addToPool(Pool pool){
        System.out.println("Thread " + this + " is added to pool.");
        this.pool = pool;
    }
    void execute(){
        System.out.println(this + " is getting executed.");
        pool.execute(this);
    }
    void idle(){
        System.out.println(this + " is currently idle.");
    }

    void finish(){
        System.out.println(this + " is finished.");
        pool.removeFromPool(this);
    }

    public abstract String toString();
}

class CPUThread extends Thread{
    @Override
    public String toString() {
        return "CPU Thread";
    }
}

class IOThread extends Thread{
    @Override
    public String toString() {
        return "IO Thread";
    }
}

class NetworkThread extends Thread{
    @Override
    public String toString() {
        return "Network Thread";
    }
}

class VirtualThread extends Thread{
    @Override
    public String toString() {
        return "Virtual Thread";
    }
}
