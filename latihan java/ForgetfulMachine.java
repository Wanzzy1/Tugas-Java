import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("what city in the capital of France? ");
        keyboard.next();

        System.out.println("What is 6 multiplied by ? ");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.0 and 0.17 ");
        keyboard.nextDouble();

    }
}

