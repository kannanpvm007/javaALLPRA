package com.kgisl.qs1.files;

import java.io.File;
import java.io.IOException;

/**
 * CreateFile
 */
public class CreateFile1 {

    public static void main(String[] args) throws IOException {
       
            File file1 = new File("D:\\sasikumar\\java\\mavenprojects\\qs1-master\\fileDemo.txt");
            if (file1.createNewFile()) {
                System.out.println("New file is created");
            } else {
                System.out.println("File is not created");

            }
      
    }
}