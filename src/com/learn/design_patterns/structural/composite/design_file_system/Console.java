package com.learn.design_patterns.structural.composite.design_file_system;

public class Console {
    public static void main(String[] args) {
        Directory showsDirectory = new Directory("Shows");
        Directory scifiDirectory = new Directory("Sci-Fi");
        Directory actionDirectory = new Directory("Action");
        Directory dramaDirectory = new Directory("Drama");

        scifiDirectory.addFileSystemObj(new File("3 body problem"), new File( "Gravity"), new File("Interstellar"));
        actionDirectory.addFileSystemObj(new File("The Matrix"), new File("Avengers"), new File("Batman Begins"));
        dramaDirectory.addFileSystemObj(new File("Shawshank Redemption"), new File("The Godfather"), new File("Bridgerton"));

        showsDirectory.addFileSystemObj(scifiDirectory, actionDirectory, dramaDirectory);

        showsDirectory.ls();
    }
}
