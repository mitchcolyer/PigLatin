import java.util.Scanner;

public class PigLatin {

    public static void main(String [] args) {

        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter any word you want: ");
        String input = readInput.nextLine();

        int length = input.length() - 1;
        char v = Character.toLowerCase(input.charAt(0));
        String sub = input.substring(1,length);

        String pigLatinWord = sub + v + "ay";

        System.out.println(pigLatinWord);

    }
}
