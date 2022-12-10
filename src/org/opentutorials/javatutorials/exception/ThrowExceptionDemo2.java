package org.opentutorials.javatutorials.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class Bbb{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class Ccc {
    void run() throws FileNotFoundException, IOException{
        Bbb b = new Bbb();
        b.run();
    }
}


public class ThrowExceptionDemo2 {
    public static void main(String[] args) {
        Ccc c = new Ccc();
        try{
            c.run();
        } catch (FileNotFoundException e){
            System.out.println("out.txt 파일은 설정 파일입니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
