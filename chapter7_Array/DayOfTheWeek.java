package chapter7_Array;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        int index;
        do {
            System.out.println("Enter a number for the day of the week");
            index = input.nextInt();
        } while (index <= 0 || index > 8);
        input.close();

        System.out.println("Corresponding day: " + week[index - 1]);
    }
}
