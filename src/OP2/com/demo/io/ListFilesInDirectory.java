package OP2.com.demo.io;


import java.io.File;

public class ListFilesInDirectory {

    public static void main(String[] args)
    {
        ListFiles("lib");
    }

    public static void ListFiles(String DirectoryName)
    {
        //project directory
        String workingDirectory = System.getProperty("user.dir");
        String  dir = workingDirectory + File.separator + DirectoryName;

        System.out.println("Final file directory : " + dir);

        //List files in the directory

        File file = new File(dir);
        File[] files=file.listFiles();

        if (file.exists()) {
            System.out.println("Directory is found!");
            for(File eachFile: files)
            {
                System.out.println(eachFile.getName());
            }
        } else {
            System.out.println("Directory is not exits");
        }

    }

    }