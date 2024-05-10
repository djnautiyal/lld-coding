package com.learn.design_patterns.behavioural.command.text_editor_commands_and_undo;

public class DeleteCommand extends Command {
    public DeleteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        editor.delete();
    }
}
