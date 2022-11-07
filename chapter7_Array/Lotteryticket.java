package chapter7_Array;

import java.util.Random;

public class Lotteryticket {
    private static final int LENGTH = 6;
    private static final int LIMIT=69;

    public static void main(String[] args) {
        int ticket[] = generateNumber();
        printlottery(ticket);

    }

    public static int[] generateNumber() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(69) +1;//explicit number means exclude 69
        }
        return ticket;
    }

    public static void printlottery(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.printf(ticket[i]+" ");
        }
    }
}
