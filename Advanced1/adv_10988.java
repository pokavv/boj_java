package Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class adv_10988 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            char front = str.charAt(i);
            char back = str.charAt(length - 1 - i);

            if (front != back) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
