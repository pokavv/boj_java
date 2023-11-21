package TwoDimensionalArray;

import java.io.*;

public class tda_10798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            if (max < str.length()) {
                max = str.length();
            }
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
    }
}
