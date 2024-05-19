package com.learn.design_patterns.structural.facade.dwarves_mine_gold;

import java.util.List;

public class DwarvenGoldMineFacade {
    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldMineFacade(){
        workers = List.of(new DwarvenGoldDigger(), new DwarvenCartOperator(), new DwarvenTunnelDigger());
    }

    public void startNewDay(){
        makeActions(DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold(){
        makeActions(DwarvenMineWorker.Action.WORK);
    }

    public void endDay(){
        makeActions(DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
    }

    private void makeActions(DwarvenMineWorker.Action... actions){
        workers.forEach(worker -> worker.action(actions));
    }
}
