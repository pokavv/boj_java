package StringOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class str_27866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int idx = Integer.parseInt(br.readLine()) - 1;

        System.out.println(str.charAt(idx));
    }
}
