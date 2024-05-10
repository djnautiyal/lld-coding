package com.learn.design_patterns.behavioural.command.text_editor_commands_and_undo;

public class UndoCommand extends Command {

    public UndoCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        if(!editor.undostack.isEmpty()) {
            Command prevCommand = editor.undostack.pop();
            Command command;
            if(prevCommand.getClass() == InsertCommand.class) command = new DeleteCommand(editor);
            else command = new InsertCommand(editor);

            editor.redostack.push(command);
            command.execute();
        }
        else System.out.println("Nothing to undo");
    }
}
