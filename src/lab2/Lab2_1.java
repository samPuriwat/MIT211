package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab2_1 {


    public static void main(String[] args) throws IOException {
        int a,b,c,d,e,f,g,h,i,j;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter number 1: ");
        a = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 2: ");
        b = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 3: ");
        c = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 4: ");
        d = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 5: ");
        e = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 6: ");
        f = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 7: ");
        i = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 8: ");
        j = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 1: ");
        g = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 1: ");
        h = Integer.parseInt(reader.readLine());

        int total = a+b+c+d+e+f+g+h+i+j;
        int average = total / 10;

        System.out.println("Total is "+total);
        System.out.println("Average is "+average);


    }
}//class
