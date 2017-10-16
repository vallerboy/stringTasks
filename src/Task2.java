import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wyraz: ");
        String word = scanner.nextLine();
        System.out.print("Podaj n: ");
        int nLastChars = scanner.nextInt();

        System.out.println(
                word.substring(word.length()-nLastChars));
    }
}
