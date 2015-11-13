import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PigLatin {

    public static void main(String [] args) {

        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter any word you want: ");
        String input = readInput.nextLine();
        String delims = "[ ]+";
        String[] tokens = input.split(delims);
        ArrayList al = new ArrayList();



        for (int i = 0; i <tokens.length; i++) {
            al.add(tokens);
        }
        Iterator iter = al.iterator();
        while (iter.hasNext()) {
            String element = (String) iter.next();

            int length = element.length();
            char v = Character.toLowerCase(element.charAt(0));
            String sub = element.substring(1,length);

            String pigLatinWord = sub + v + "ay";
            System.out.println(pigLatinWord);

        }

/*
            int length = input.length();
            char v = Character.toLowerCase(input.charAt(0));
            String sub = input.substring(1, length);

            String pigLatinWord = sub + v + "ay";



            System.out.println(pigLatinWord);

            System.out.println(tokens[i]);
            System.out.println(al.toString());
*/


    }
}
