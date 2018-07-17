package lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        int x,y;
        Scanner scanner = new Scanner(System.in);
        //input data
        System.out.print("Enter integer 1: ");
        x = scanner.nextInt();  // get data into x
        System.out.print("Enter integer 2: ");
        y = scanner.nextInt();
        //test condition
        if (x > y) {
            System.out.println(x+" มากกว่า "+y);
        }else {
            System.out.println(y+" มากกว่า "+x);
        }



    }//main
}//class
