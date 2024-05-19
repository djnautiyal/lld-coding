package com.learn.design_patterns.behavioural.mediator.executor_service_for_threads;

public class ExecutorService {
    public static void main(String[] args) {
        Pool pool = new Pool();

        Thread cpu = new CPUThread();
        Thread io = new IOThread();
        Thread network = new NetworkThread();
        Thread virtual = new VirtualThread();

        pool.addToPool(cpu);
        pool.addToPool(io);
        pool.addToPool(network);
        pool.addToPool(virtual);

        cpu.execute();
        System.out.println();

        io.execute();
        System.out.println();

        network.execute();
        System.out.println();

        virtual.execute();
        System.out.println();

        cpu.finish();
        System.out.println(pool);

        network.finish();
        System.out.println(pool);

        virtual.finish();
        System.out.println(pool);

        io.finish();
        System.out.println(pool);
    }
}
