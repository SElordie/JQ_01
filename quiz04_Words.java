package exam;

import java.util.Scanner;

public class quiz04_Words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: "); String input = sc.nextLine();
        String[] ss = input.split("\\s+"); int i, j, k = 0;

        for (i = 0; i < ss.length; i++) {
            int x = 1;
            if (ss[i] != null) {
                for (j = i + 1; j < ss.length; j++) {
                    if (ss[i].equals(ss[j])) {
                        x++;
                        ss[j] = null;
                    }
                }
            }

            if (x > 1) {
                System.out.println("Duplicate word: " + ss[i]);
                k++;
            }
        }

        if (k == 0) {
            System.out.println("No duplicate words found.");
        }

    }
}
