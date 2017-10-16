import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz wyraz: ");
        String word = scanner.nextLine();

        System.out.println("Dlugos wyrazu: " + word.trim().length());
    }
}
