package OP2.com.demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

// ***************  Read Line Number in a Text File Java ********************

public class ReadTextFileLineNumber {

    public static void main(String[] args) throws IOException {
        ReadToString("test.txt");
    }

    public static void ReadToString(String fileToRead) throws IOException {
        StringBuilder contents = new StringBuilder();
        String workingDir = System.getProperty("user.dir");
        File file = new File(workingDir + File.separator +fileToRead);
        System.out.println(file);
        LineNumberReader reader = new LineNumberReader(new FileReader(file));
        BufferedReader br=new BufferedReader(new FileReader(file));
        String s="";
        while (reader.readLine()!=null) {
            int lineNumber = reader.getLineNumber();
           s=br.readLine();
            System.out.println(lineNumber +":" +"content "+s);
        }
    }
}