package com.learn.design_patterns.behavioural.command.text_editor_commands_and_undo;

public class InsertCommand extends Command {

    public InsertCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        editor.add();
    }
}
