package lab5;

import java.util.ArrayList;

public class ex4 {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();

        myList.add("sam"); //0
        myList.add("ann"); //1
        myList.add("ton"); //2
        myList.add("bow"); //3
        myList.add("keaw"); //4
        System.out.println(myList);

        myList.add(2, "ji");
        System.out.println(myList);
        myList.remove("ton");
        System.out.println(myList);
        System.out.println(myList.indexOf("bows"));





    }


}//class
