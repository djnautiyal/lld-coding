package com.learn.design_patterns.behavioural.command.text_editor_commands_and_undo;

public class RedoCommand extends Command{

    public RedoCommand(Editor editor) {
        super(editor);
    }
    @Override
    public void execute() {
        if(!editor.redostack.isEmpty()){
            Command prevCommand = editor.redostack.pop();
            Command command;
            if(prevCommand.getClass() == InsertCommand.class) command = new DeleteCommand(editor);
            else command = new InsertCommand(editor);
            command.execute();
        }
        else System.out.println("Nothing to redo");
    }
}
