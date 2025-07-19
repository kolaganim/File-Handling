package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public FileWriting() {
    }

    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("src/main/text.text",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Helloworld! Coming from code!");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
