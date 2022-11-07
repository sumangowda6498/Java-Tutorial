package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {

        //createNewFile();
        numbersHndlingException();
        tryWithResources();
        try {
            createNewFilethrough();
        }catch (Exception e){

        }
    }
    public static void createNewFile(){
        File file=new File("resources/newfile.txt");
        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println("path or directory is wrong");
            e.printStackTrace();

        }
    }
    public static void numbersHndlingException(){
        File file= new File("resource/newfile.txt");
        Scanner filereader =null;
        try {
             filereader = new Scanner(file);
            while (filereader.hasNext()){
                double num=filereader.nextDouble();
                System.out.println(num);
            }
             }catch (FileNotFoundException |InputMismatchException e){
                    e.printStackTrace();
        }finally {
            filereader.close();
        }
    }
    public static void tryWithResources(){
        File file = new File("resources/numbers.txt");
        try(Scanner fileReader = new Scanner(file)){
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
    }
    public static void createNewFilethrough() throws  IOException{//we can also use only 'Exception' if we don't know which  error is throwing
        File file=new File("resources/newfile.txt");

            file.createNewFile();


        }
    }




