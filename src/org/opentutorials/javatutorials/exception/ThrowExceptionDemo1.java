package org.opentutorials.javatutorials.exception;

import java.io.*;
class Be{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class E {
    void run(){
        Be b = new Be();
//        b.run();
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


public class ThrowExceptionDemo1 {
    public static void main(String[] args) {
        E e = new E();
        e.run();
    }
}
