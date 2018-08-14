package lab3;

public class Quiz1_1 {

    public static void main(String[] args) {

        int count=0;
        int total = 0;

        for (int i = 500; i <= 1000; i++) {
            if (i % 3 == 0 && i % 6 == 0) {
                count++;
                total += i; //total = total +i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nThe counting number is :"+count);
        System.out.println("The total value is "+total);
        System.out.println("The average value is "+total/count);

    }//main

}//class
