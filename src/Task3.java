import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wyraz: ");

        String word = scanner.nextLine();

//        if(word.endsWith("M") || word.endsWith("m")){
//            System.out.println("Konczy sie na 'm'");
//        }else{
//            System.out.println("Nie konczy sie");
//        }

        //System.out.println(word.toLowerCase().endsWith("m"));

        if(word.charAt(word.length()) == 77 || word.charAt(word.length()) == 109){
            System.out.println("Konczy sie na 'm'");
        }

    }
}
