package Chapter13Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        cerateNewfile();
        numberHsndlingexception();
        numberException();
        calculateworkHour(41);    }
    public static void cerateNewfile(){
        File file=new File("resources/new.txt");
        try {
            file.createNewFile();
            }catch (IOException | InputMismatchException e){
            System.out.println("Directory not found");
            e.printStackTrace();
        }
    }
    public static void numberHsndlingexception(){
        File file=new File("resources/numbers.txt");
        try {
        Scanner filereader=new Scanner(file);
        while(filereader.hasNext()){
            double num= filereader.nextDouble();
            System.out.println(num);
        }
        }catch (FileNotFoundException e) {
            System.out.println("Directory not found");
            e.printStackTrace();

        }catch (InputMismatchException e){
            System.out.println("Input miss amtch ecxception");
          e.printStackTrace();
        }
    }
    public static void numberException(){
        File file=new File("resources/numbers.txt");
        try(Scanner filereader=new Scanner(file)) {
            while(filereader.hasNext()){
                double num= filereader.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("Input miss amtch ecxception  and file not found");
            e.printStackTrace();
        }
    }
    public static void calculateworkHour(int hour){
        if(hour>40){
            throw new IllegalArgumentException("we do not allow Overtime");
        }
    }
}

