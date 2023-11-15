package StringOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class str_11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (byte value : br.readLine().getBytes()) {
            sum += (value - 48); // '0' == 48
        }

        System.out.println(sum);
    }

    // getBytes() : String 에 대하여 해당 String 을 하나의 byte 배열로 변환 해주는 메서드

    /*
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split("");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
    }
     */
}
