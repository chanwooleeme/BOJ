package Step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int sum = 0;
        for (int i : list)
            sum += i;
        System.out.println(sum / 5);
        System.out.println(list.get(2));
    }
}
