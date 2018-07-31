package lab3;

import java.util.Scanner;

public class calGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score;

        do {
            System.out.print("กรุณากรอกคะแนนของคุณ: ");
            score = scanner.nextInt();
            if (score <0 || score>100)
                System.out.println("กรุณากรอกคะแนนในช่วง 0-100 เท่านั้น");

        }while(score <0 || score>100);

        if (score<50) System.out.println("Your grade is F.");
        else if(score <55) System.out.println("Your grade is D.");
        else if(score <60)System.out.println("Your grade is D+.");
        else if(score <65) System.out.println("Your grade is C.");
        else if(score <70)System.out.println("Your grade is C+.");
        else if (score <75)System.out.println("Your grade is B.");
        else if (score <80)System.out.println("Your grade is B+.");
        else if (score <=100)System.out.println("Your grade is A.");
        else System.out.println("กรุณากรอกค่าคะแนนให้ถูกต้อง");

        System.out.println("Good Bye.");

    }//main

}//class
