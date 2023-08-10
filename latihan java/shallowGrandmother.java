import java.util.Scanner;

public class shallowGrandmother {
    public static void main( String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int age;
        double income, smart;
        boolean allowed;

        System.out.print("ketik umur mu: ");
        age = keyboard.nextInt();

        System.out.print("Enter your yearly income: ");
        income = keyboard.nextDouble();

        System.out.print("How smart you are, on scale from 0.0 to 10.0? ");
        smart = keyboard.nextDouble();

        allowed = ( age > 25 && age < 40 && ( income > 50000 || smart >= 8.5 ) );

        System.out.println("Allowed to learning with my grandchild? " + allowed);
    }

}