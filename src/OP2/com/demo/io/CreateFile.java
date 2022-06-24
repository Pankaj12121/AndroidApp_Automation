package OP2.com.demo.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args)
    {
        CreateNewFile("test1.txt");
    }

//Create a new file
    public static void CreateNewFile(String filename) {
        //get current project path
        String filePath = System.getProperty("user.dir");
        //create a new file
        File file = new File(filePath + "\\" + filename);

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File is created");
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }