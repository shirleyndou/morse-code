import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String letters = scan.nextLine();

        MorseCode message = new MorseCode(letters);
        System.out.println(message.morseCodeToLetters());

    }
}
