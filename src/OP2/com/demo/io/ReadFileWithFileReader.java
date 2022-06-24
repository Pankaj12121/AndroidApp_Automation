package OP2.com.demo.io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


//***************************Read file in Java***************************

public class ReadFileWithFileReader {

    public static void main(String[] args)
    {
   System.out.println(ReadToString("test.txt"));
    }

    public static String ReadToString(String FileToText)
    {
           String workingDir = System.getProperty("user.dir");
        StringBuilder fileContent=new StringBuilder();
        File filePath = new File(workingDir + File.separator);
        System.out.println(filePath);

        try
        {
            FileReader fr = new FileReader(filePath+File.separator+FileToText);
            BufferedReader br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                fileContent.append(sCurrentLine);
            }

                   } catch (IOException e) {
            System.out.println("Cannot read the text file");
        }
        return fileContent.toString();
    }
}