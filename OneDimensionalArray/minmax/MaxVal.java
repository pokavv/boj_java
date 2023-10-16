package OneDimensionalArray.minmax;

import java.io.*;

public class MaxVal {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int maxNumIdx = 0;
        for (int i = 0; i < 9; i++) {
            int val = Integer.parseInt(br.readLine());

            if (val > max) {
                max = val;
                maxNumIdx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(maxNumIdx);
    }
}
