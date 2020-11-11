package Question4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Rounding Bot!");

        Scanner scanner = new Scanner(System.in);

        boolean trial = true;

        while (trial){
            System.out.println("Give me a decimal number please :)");
            double number = scanner.nextDouble();

            if ( number % 1 == 0) {
                System.out.println("You did not give me a decimal number :(.");
            }
            else {
                System.out.println("For rounding lower please press '1'. For rounding greater please press '2'. For exit please press '3' ! ");

                int choice = scanner.nextInt();

                if ( choice==1 ) {
                    System.out.println(Math.floor(number));
                }
                else if ( choice==2 ) {
                    System.out.println(Math.ceil(number));
                }
                else if ( choice==3 ) {
                    System.out.println("Thank you! See ya ;)");
                    break;
                }
                else {
                    System.out.println("For rounding lower please press '1'. For rounding greater please press '2' ! ");
                }

            }
        }

    }

}

