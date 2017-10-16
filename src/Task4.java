import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wyraz: ");

        String word = scanner.nextLine();

        char firstLetter =  word.charAt(0);
//        if(firstLetter >= 48 && firstLetter <= 57){
//            System.out.println("To jest liczba!!!!");
//        }

        if(Character.isDigit(firstLetter)){
            System.out.println("To jest liczba!");
        }
    }
}
