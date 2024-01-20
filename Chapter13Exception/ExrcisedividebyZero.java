package Chapter13Exception;

public class ExrcisedividebyZero {
    public static void main(String[] args) {
        try {
            int c = 30 / 0;
        }catch (ArithmeticException y) {

            System.out.println("Dividing by zero is not permitted");
        }finally {
            System.out.println(" Play Bold!.");
        }



    }
}
