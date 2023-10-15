package Loop.receipt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Receipt {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalAmount = Integer.parseInt(br.readLine());
        int typeNum = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < typeNum; i++) {
            String[] str = br.readLine().split(" ");
            int price = Integer.parseInt(str[0]);
            int num = Integer.parseInt(str[1]);

            sum += price * num;
        }

        if (totalAmount == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
