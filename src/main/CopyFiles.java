package main;

import java.io.*;

public class CopyFiles {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/main/abc.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("src/main/abc.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            String line = br.readLine();
            while(line!= null){
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            bw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
