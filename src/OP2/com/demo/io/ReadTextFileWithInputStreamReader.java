package OP2.com.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//************************Read Text File With Input Stream Reader *************************

public class ReadTextFileWithInputStreamReader {

    public static void main(String[] args) throws IOException {
        System.out.println(ReadToString("testfile.txt"));
    }

    public static String ReadToString(String FileToText) throws IOException {
        StringBuilder contents = new StringBuilder();
        String workingDir = System.getProperty("user.dir");
        File filePath = new File(workingDir + File.separator);
        System.out.println(filePath);
        Reader reader=null;
        try {
            InputStream inputStream = new FileInputStream(filePath + File.separator + FileToText);
            reader = new InputStreamReader(inputStream);

            int data = reader.read();
            while (data != -1) {
                char theChar = (char) data;
                data = reader.read();
                contents.append(theChar);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
        return contents.toString();

    }
}