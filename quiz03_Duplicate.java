package exam;

import java.util.Scanner;

public class quiz03_Duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); System.out.print("Please enter a string: ");
        String s = sc.nextLine(); int i, k = 0; char c;

        for (i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                k++;
                    System.out.println(c);
            }
        }

        if (k != 0) {
            System.out.println("There are " + k + " duplicate characters!");
        } else {
            System.out.println("There are NONE!");
        }

    }
}
