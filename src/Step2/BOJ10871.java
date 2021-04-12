package Step2;

import java.io.*;
import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int limit = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            int n = scanner.nextInt();
            if (n < limit)
                System.out.print(n + " ");
        }
    }
}
