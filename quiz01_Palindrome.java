package exam;

import java.util.Scanner;

public class quiz01_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s; int x = 0, y; boolean b = true;

        System.out.println("Enter a string:");
        s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        y = s.length() - 1;

        while (x < y) {
            if (s.charAt(x) != s.charAt(y)) {
                b = false;
                break;
            }
            x++;
            y--;
        }

        if (b) {
            System.out.println("Is in fact a palindrome!");
        }
        else {
            System.out.println("Isn't a palindrome!");
        }

    }
}
