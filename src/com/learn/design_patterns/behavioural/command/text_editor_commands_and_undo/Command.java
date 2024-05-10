package com.learn.design_patterns.behavioural.command.text_editor_commands_and_undo;

public abstract class Command {
    public Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }
    abstract public void execute();
}
