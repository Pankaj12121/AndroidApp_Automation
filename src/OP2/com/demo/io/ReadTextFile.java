package OP2.com.demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


//****************************Read Text File with Buffered Reader Java************************
public class ReadTextFile {

    public static void main(String[] args)
    {
   System.out.println(ReadToString("test.txt"));
    }

    public static String ReadToString(String FileToText)
    {
        StringBuilder contents=new StringBuilder();
        String workingDir = System.getProperty("user.dir");
        File filePath = new File(workingDir + File.separator);
        System.out.println(filePath);

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filePath+File.separator+FileToText));
            String s;

            while ((s = br.readLine()) != null) {
                contents.append(s);
            }

        } catch (IOException e) {
            System.out.println("Cannot read the text file");
        }
        return contents.toString();
    }
}