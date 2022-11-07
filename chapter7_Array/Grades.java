package chapter7_Array;

import java.util.Scanner;

public class Grades {
    private  static int grades[];
    private static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("enter how many grades");
        grades=new int[sc.nextInt()];

        getGrdaes();
        System.out.println("Average: " + String.format("%.2f", average()));
        System.out.println("Highest: " + heihestgrade());
        System.out.println("Lowest: " + lowestgrade());

    }
    public static void getGrdaes(){
        for (int i=0;i< grades.length;i++) {
            System.out.printf("enter the grade " + (i + 1));
            grades[i] = sc.nextInt();

        }

    }
        public static int calcuateSum(){
            int sum=0;
            for(int grade : grades){
                sum=sum+grade;
            }
            return sum;
        }
        public static double average(){
            return calcuateSum()/grades.length;
        }

        public static int heihestgrade(){

            int heighest=grades[0];
            for(int grade:grades){
                if(grade>heighest){
                    heighest=grade;
                }
            }
            return heighest;
        }

        public static int lowestgrade(){
            int lowest;
            lowest=grades[0];
            for(int grade:grades){
                if( grade<lowest){
                    lowest=grade;
                }
            }
            return lowest;

        }
    }
