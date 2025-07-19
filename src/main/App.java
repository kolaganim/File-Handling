package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fr = new FileReader("src/main/text.text");
            /*int ch = fr.read();
            while(ch != -1){
                System.out.print((char)ch);
                ch = fr.read();
            }*/
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            while(str != null){
                System.out.println(str);
                str = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

