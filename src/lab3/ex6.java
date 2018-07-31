package lab3;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        //รับ input จากผู้ใช้ไปเรื่อยๆ
        // เมื่อผู้ใช้ ใส่เลข 0 จึงหยุดการทำงาน
        Scanner input = new Scanner(System.in);
        int x=1;
        while (x !=0){
            System.out.print("enter an integer: ");
            x = input.nextInt();
        }//while
        System.out.println("Good Bye.");




    }//main
}//class
