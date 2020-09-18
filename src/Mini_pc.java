import java.util.Scanner;

public class Mini_pc {
    public static void main(String[] args) {
        System.out.println("velkommen til Mc");


        for (int i = 0; i < 10; i++) {

            System.out.println("hvilket program vil du køre [1...9]");

            Scanner input = new Scanner(System.in);
            int x = input.nextInt();

            if ( x == 1 ) {Terning.kast(); }

        }
        System.out.println("bye bye");

    }
}
