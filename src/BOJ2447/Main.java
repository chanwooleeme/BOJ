package BOJ2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static char[][] map;

    public static void recursive(int n, int x, int y) {
        if (n == 1) {
            map[x][y] = '*';
            return;
        }
        int div = n / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1);
                else
                    recursive(div, x + (i * div), y + (j * div));
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = ' ';
            }
        }
        recursive(n, 0, 0);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                builder.append(map[i][j]);
            }
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}