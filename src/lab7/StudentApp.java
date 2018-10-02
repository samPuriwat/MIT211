package lab7;

public class StudentApp {

    public static void main(String[] args) {
        //create object
        Student std = new Student("Puriwat",
                "001",
                "puriwat.l@rmutsv.ac.th",
                "083665511",
                32);

        System.out.println(std.toString());

        std.setName("Puriwat Lertkrai");

        System.out.println(std.toString());

    }





}//class
