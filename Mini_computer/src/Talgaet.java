import java.util.Scanner;

public class Talgaet {
    public static void gaet() {
        System.out.println("Guess a number between 1 and 6");
        double interval = Math.random() * (6 - 1 + 1) + 1;
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();

        if (p == (int)interval) {
            System.out.println(p);
            System.out.println((int)interval);
            System.out.println("Guessed right!");
        }
        else {
            System.out.println(p);
            System.out.println((int)interval);
            System.out.println("Guessed wrong");
        }

    }

}
