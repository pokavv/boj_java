package SortProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort_1427 {

    public static void arraysSort(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void countingSort(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] cnt = new int[10];

        for (int i = 0; i < n.length(); i++) {
            cnt[n.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            while (cnt[i]-- > 0) {
                System.out.print(i);
            }
        }
    }

    public static void inputStreamCountingSort(String[] args) throws IOException {

        InputStream in = System.in;
        int[] cnt = new int[10];
        int n;

        while ((n = in.read()) != '\n') {
            cnt[n - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            while (cnt[i]-- > 0) {
                System.out.print(i);
            }
        }
    }
}
