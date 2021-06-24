package Step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int odd = Integer.parseInt(br.readLine());
            if (odd % 2 == 0)
                continue;
            else
                list.add(odd);
        }
        if (list.isEmpty())
            System.out.println("-1");
        else {
            int sum = 0;
            for (int i : list)
                sum += i;
            System.out.println(sum);
            System.out.println(Collections.min(list));
        }

    }
}
