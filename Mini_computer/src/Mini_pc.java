import java.util.Scanner;

public class Mini_pc {
    public static void main(String[] args) {
        System.out.println("velkommen til Mc");


        for (int i = 0; i < 3; i++) {

            System.out.println("hvilket program vil du køre [1...9]");

            Scanner input = new Scanner(System.in);
            int x = input.nextInt();

            if (x == 1) {Terning.kast();}
            if (x == 2) {Talgaet.gaet();}
            if (x == 3) {Dagetiljul.Dagtiljul();}

        }
        System.out.println("bye bye");

    }
}
