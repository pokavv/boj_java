package OneDimensionalArray.remainder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remainder {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[10];

        for (int i = 0; i < 10; i++) {
            int n = (Integer.parseInt(br.readLine())) % 42;
            arr[i] = n;
        }

        Set<Integer> numSet = new HashSet<Integer>(Arrays.asList(arr));
        System.out.println(numSet.size());
    }
}
