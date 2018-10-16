package lab9;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {

        try {

            File myFile = new File("D:\\MIT211\\src\\lab9\\mit.txt");//mit.txt
            if (myFile.createNewFile())
                System.out.println("New File created.");
            else
                System.out.println("File already exited.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //write File
            //writeMyFile();
        //read file
            readMyFile();

    }//main

    private static void readMyFile() {
        try {
            FileReader reader = new FileReader("D:\\MIT211\\src\\lab9\\mit.txt");
            int i;
            while ((i = reader.read()) != -1) {
                    System.out.print((char) i);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//readMyFile

    private static void writeMyFile() {
        Writer w = null;
        try {
             w = new FileWriter("D:\\MIT211\\src\\lab9\\mit.txt",true);
            String content = "MIT SAIYAI 2018 \r\n";
            w.write(content);
            System.out.println("Done.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
                w.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//writeMyFile
}//class
