package exam;

import java.util.Scanner;

public class sse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: "); // HH OO UU S EE
        String s = sc.nextLine();

        char c = '\0', ch;
        int i, j;
        boolean b;

        for (i = 0; i < s.length(); i++) {

            ch = s.charAt(i); // H
            b = false;

            for (j = 0; j < s.length(); j++) {

                // H

                if (i != j && ch == s.charAt(j)) {

                    b = true;
                    break;

                }

            }

            if (!b) {

                c = ch; // S
                break;

            }
        }

        if (c == '\0') {
            System.out.println("ERROR/NONE FOUND!");
        }

        System.out.println("First N-R character --> " + c);

    }
}
