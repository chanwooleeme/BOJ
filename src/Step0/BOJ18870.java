package Step0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int token = Integer.parseInt(tk.nextToken());
            list.add(token);
        }
        List<Integer> result = list.stream().distinct().sorted().collect(Collectors.toList());

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < result.size(); i++) {
            map.put(result.get(i), i);
        }
        StringBuilder builder = new StringBuilder();
        for (int integer : list) {
            builder.append(map.get(integer))
                    .append(" ");
        }
        System.out.println(builder.toString());
    }
}
