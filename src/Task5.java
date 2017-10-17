import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź słowo: ");

        String word = scanner.nextLine();

        if(word.charAt(0) == word.charAt(word.length()-1)){
            System.out.println("TAK!");
        }else{
            System.out.println("NIE!");
        }
    }
}
