import java.util.Scanner;

public class Task5Bonus {
    public static void main(String[] args) {
        // Odwróć wyraz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadz wyraz: ");
        String word = scanner.nextLine();

        for(int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }

        System.out.println();

        //Szybszy sposob
        System.out.println(new StringBuilder(word).reverse().toString());

    }
}
