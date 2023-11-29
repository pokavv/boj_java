package NormalMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_2720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int money = Integer.parseInt(br.readLine());

            int quarter = money / 25;
            money %= 25;
            int dime = money / 10;
            money %= 10;
            int nickel = money / 5;
            money %= 5;
            int penny = money;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
