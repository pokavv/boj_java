package OneDimensionalArray.basket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasketFlip {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;

            /*
            증감 연산자 : ++, --
            - 전위형 ++i : 참조 되기 전에 증가
            - 후위형 i++ : 참조된 후에 증가
             */
            while (I < J) {
                int tmp = basket[I];
                basket[I++] = basket[J];
                basket[J--] = tmp;
                //System.out.println(Arrays.toString(basket));
            }
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
