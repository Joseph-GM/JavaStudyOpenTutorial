package org.opentutorials.javatutorials.chanyoungIf;

import java.util.*;
import java.lang.*;

public class Chanyoung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 수정부분 intput --> input
        int score;
        String result = "";
//        char grade; //grade 안쓰므로 삭제
        System.out.println("점수를 입력해 주세요.> "); //println으로 바꿈
        score = input.nextInt(); //괄호 수정
        if( score >= 98 )
            result = "A+";
        else if (score >= 95)
            result = "A0";
        else if (score >= 90)
            result = "A-";
        else if (score >= 88)
            result = "B+";
        else if (score >= 85)
            result = "B0";
        else if (score >= 80)
            result = "B-";
        else
            result = "C";
        System.out.println("성적 : " + score) ; //printIn이 아니고 println (소문자 L)
        System.out.println("등급 : " + result); //grade --> result, Println --> println
    }
}
