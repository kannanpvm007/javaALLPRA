package com.kgisl.qs1.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class FileDemo {
    public static void main(String[] args) throws IOException {
        try {
            File inputFile = new File("D://files/fileIn.txt");
            File outputFile = new File("D://files/fileOut.txt");

            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);

            int count;
            while ((count = fis.read()) != -1) {
                fos.write(count);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}