
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write test code here
        System.out.print("Give a string: ");
        String text = new Scanner(System.in).nextLine();
        if(allVowels(text))
            System.out.println("The form is fine.");
        else
            System.out.println("The form is wrong.");
    }
    
    public static boolean isAWeekDay(String string)
    {
        if(string.matches("mon|tue|wed|thu|fri|sat|sun"))
            return true;
        else
            return false;
    }
    
    public static boolean allVowels(String string)
    {
        if(string.matches("(a|i|e|o|u|y|ä|ö)+"))
            return true;
        else
            return false;
    }
    
    public static boolean clockTime(String string)
    {
        if(string.matches("([0-1][0-9]|[2][0-3]):([0-5][0-9]):[0-5][0-9]"))
            return true;
        else
            return false;
    }
}