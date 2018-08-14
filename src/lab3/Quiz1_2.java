package lab3;

import java.util.Scanner;

public class Quiz1_2 {

    public static void main(String[] args) {
        int select;
        double price=0, total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("####### Please select product type #######\n");

        System.out.println("Type 1 10%");
        System.out.println("Type 2 15%");
        System.out.println("Type 3 17%");
        System.out.println("Type 4 20%");

        System.out.print("Select: ");
        select = sc.nextInt();
        System.out.print("Price: ");
        price = sc.nextDouble();

        switch (select) {
            case 1: total = price + (price * 0.1); break;
            case 2: total = price + (price * 0.15); break;
            case 3: total = price + (price * 0.17); break;
            case 4: total = price + (price * 0.20); break;
            default: System.out.println("Please select product type (1-4)");

        }

        System.out.println("Total price: "+total);


    }//main
}//class
