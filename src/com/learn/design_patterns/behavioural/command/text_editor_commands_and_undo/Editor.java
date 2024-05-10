package com.learn.design_patterns.behavioural.command.text_editor_commands_and_undo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
    public Deque<Command> undostack = new ArrayDeque<>();
    public Deque<Command> redostack = new ArrayDeque<>();
    StringBuilder text = new StringBuilder();

    public void add(){
        text.append("add");
        System.out.format("Updated text is: %s\n", text);
    }

    public void delete(){
        if(text.isEmpty()) {
            System.out.print("No text to delete.\n");
            return;
        }
        text.delete(text.length() - 3, text.length());
        System.out.format("Updated text is: %s\n", text);
    }


    public static void main(String[] args) {
        Editor editor = new Editor();

        while (true){
            System.out.println("1. Insert\n2. Delete \n3. Undo\n4. Redo\n5. Exit");
            int choice = new java.util.Scanner(System.in).nextInt();
            switch (choice){
                case 1: InsertCommand ins = new InsertCommand(editor); ins.execute(); editor.undostack.push(ins); break;
                case 2: DeleteCommand del = new DeleteCommand(editor); del.execute(); editor.undostack.push(del); break;
                case 3: UndoCommand undo = new UndoCommand(editor); undo.execute(); break;
                case 4: RedoCommand redo = new RedoCommand(editor); redo.execute(); break;
                case 5: return;
            }
        }
    }
}
