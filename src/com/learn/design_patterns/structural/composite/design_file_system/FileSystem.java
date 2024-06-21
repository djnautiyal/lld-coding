package com.learn.design_patterns.structural.composite.design_file_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface FileSystem {
    void ls();
}

class File implements  FileSystem{
    String fileName;

    File(String name){ this.fileName = name; }

    @Override
    public void ls() {
        System.out.println("file name: " + fileName);
    }
}

class Directory implements FileSystem {
    String dirName;
    List<FileSystem> fileSystemList;

    Directory(String name) {
        this.dirName = name;
        this.fileSystemList = new ArrayList<>();
    }

    void addFileSystemObj(FileSystem... fileSystemObjs) {
        fileSystemList.addAll(Arrays.asList(fileSystemObjs));
    }

    @Override
    public void ls() {
        System.out.println("Directory:" + dirName);

        fileSystemList.forEach(FileSystem::ls);
    }
}