package frequency;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int frequency = countFrequency(str, ch);

        System.out.println("The frequency of '" + ch + "' in the string is: " + frequency);
        sc.close();
    }

    public static int countFrequency(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}