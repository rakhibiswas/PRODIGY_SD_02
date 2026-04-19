//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Random rand= new Random();
       Scanner sc=new Scanner(System.in);
       int number =rand.nextInt(100)+1;
       int guess =0;
       int attempts=0;
       System.out.println("Welcome to the guessing Game!");
       System.out.println("Guess a number between 1 to 100");

       while(guess != number) {
           System.out.println("Enter you guess:");
           guess = sc.nextInt();
           attempts++;

           if (guess < number) {
               System.out.println("To low! Try again.");
           } else if (guess > number) {
               System.out.println("Too high! Try again.");
           } else {
               System.out.println("Correct! you guessed the number.");
               System.out.println("Total attemps:" + attempts);
           }
       }

       }
    }