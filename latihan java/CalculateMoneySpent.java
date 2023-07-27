import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args) {
        String name;
        int moneySpent;
        double average;
        int total;
        int totalDay = 7;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate Your Money!!!\n");

        System.out.println("Hey, What is yout name?");
        name = input.nextLine();

        System.out.println("how much money did you spend at the club on Monday");
        moneySpent = input.nextInt();

        total = moneySpent;

        System.out.println("How much money did you spend at the club on Tuesday");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("How much money did you spend at the club on Wednesday");
        moneySpent = input.nextInt();

        total = total + moneySpent;
        System.out.println("How much money did you spend at the club on Thursday");
        moneySpent = input.nextInt();

        total = total + moneySpent;
        System.out.println("How much money did you spend at the club on Saturday");
        moneySpent = input.nextInt();

        total = total + moneySpent;
        System.out.println("How much money did you spend at the club on Sunday");
        moneySpent = input.nextInt();

        total = total + moneySpent;
        System.out.println("How much money did you spend at the club on Sunday");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        average = (double) total/totalDay;

        System.out.println("The Calculate Result:");

        System.out.println("Hi Udin.");

        System.out.println("Hasil total di club minggu ini adalah $" + total);
        System.out.println("pengeluaran harian rata rata $" + average);
    }
}
