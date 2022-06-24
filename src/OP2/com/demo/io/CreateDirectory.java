package OP2.com.demo.io;

import java.io.File;
import java.io.IOException;

public class CreateDirectory {

    public static void main(String[] args)
    {
        CreateADirectory("testdir1");
    }

    public static void CreateADirectory(String DirectoryName)
    {
        //project directory
        String workingDirectory = System.getProperty("user.dir");
        String  dir = workingDirectory + File.separator + DirectoryName;

        System.out.println("Final file directory : " + dir);

        //create a directory in the path

        File file = new File(dir);

        if (!file.exists()) {
            file.mkdir();
            System.out.println("Directory is created!");
        } else {
            System.out.println("Directory is already existed!");
        }

    }

    }