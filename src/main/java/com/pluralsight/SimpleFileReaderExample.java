package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("cream.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String Line = bufferedReader.readLine();

        while (Line != null) {
            System.out.println(Line);
            Line = bufferedReader.readLine();
        }

        bufferedReader.close();

    }
}
