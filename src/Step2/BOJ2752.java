package Step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        int c = Integer.parseInt(tokenizer.nextToken());
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int middle;
        if (a != max && a != min)
            middle = a;
        else if (b != max && b != min)
            middle = b;
        else
            middle = c;
        StringBuffer s = new StringBuffer()
                .append(min)
                .append(" ")
                .append(middle)
                .append(" ")
                .append(max);
        System.out.println(s);
    }
}
