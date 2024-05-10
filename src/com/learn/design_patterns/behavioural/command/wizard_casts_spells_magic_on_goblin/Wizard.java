package com.learn.design_patterns.behavioural.command.wizard_casts_spells_magic_on_goblin;

import java.util.ArrayDeque;
import java.util.Deque;

public class Wizard {
    private final Deque<Runnable> undoStack = new ArrayDeque<>();
    private final Deque<Runnable> redoStack = new ArrayDeque<>();

    public Wizard(){}

    public void castSpell(Runnable spell){
        spell.run();
        undoStack.push(spell);
    }

    public void undoLastSpell(){
        if(!undoStack.isEmpty()){
            var spell = undoStack.pop();
            spell.run();
            redoStack.push(spell);
        }
        else System.out.format("No spell to undo.");
    }

    public void redoLastSpell(){
        if(!redoStack.isEmpty()){
            var spell = redoStack.pop();
            undoStack.push(spell);
            spell.run();
        }
    }

    @Override
    public String toString(){
        return "Wizard";
    }
}
