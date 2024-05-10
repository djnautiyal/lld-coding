package com.learn.design_patterns.behavioural.command.wizard_casts_spells_magic_on_goblin;

public class Story {
    public static void main(String[] args) {
        var wizard=new Wizard();
        var goblin=new Goblin();

        goblin.printStatus();
        wizard.castSpell(goblin::changeSize);
        goblin.printStatus();

        wizard.castSpell(goblin::changeVisibility);
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();

    }
}
