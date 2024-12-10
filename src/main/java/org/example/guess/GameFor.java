package org.example.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        Random random = new Random();
        int ans = random.nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("輸入你的第" + i + "/4次");
            num = scanner.nextInt();
            if(num > ans){
                System.out.println("小一點");

            }else if(num < ans){
                System.out.println("大一點");
            }else {
                System.out.println("答對了");
                break;
            }



        }
    }
}
