package org.example.guess;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(10)+1;
        int num = 0;
        while (num != answer){
            num = scanner.nextInt();
           if(num > answer){
               System.out.println("低一點");
           }else if(num < answer){
               System.out.println("高一點");
           }else{
               System.out.println("答對了");
           }
        }


    }
}
