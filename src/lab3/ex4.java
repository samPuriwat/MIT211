package lab3;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        int select;
        System.out.println("เลือกรายวิชาที่คุณชอบมากที่สุด ?");
        System.out.println("1.Accounting");
        System.out.println("2.Marketing");
        System.out.println("3.System Analysis");
        System.out.println("4.Computer Programming");

        Scanner input = new Scanner(System.in);

        System.out.print("เลือกหมายเลข (1-4): ");
        select = input.nextInt();
        //switch-case
        switch (select){
            case 1: System.out.println("คุณชอบ Accounting");break;
            case 2: System.out.println("คุณชอบ Marketing");break;
            case 3: System.out.println("คุณชอบ System Analysis");break;
            case 4: System.out.println("คุณชอบ Computer Programming");break;
            default: System.out.println("กรุณาเลือกหมายเลข 1-4 เท่านั้น");
        }//switch-case






    }//main



}//class
