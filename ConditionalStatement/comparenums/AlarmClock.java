package ConditionalStatement.comparenums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlarmClock {

    /**
     * - 알고리즘
     * min 을 45 보다 작으면 hour - 1 을 해주고
     * 아닐 경우, min - 45 를 한다.
     * 또한 hour 가 0 보다 작아질 경우 hour 를 23 으로 수정한다.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int hour = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[1]);

        if (min < 45) {
            hour--;
            min = 60 - (45 - min);
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + (min - 45));
        }
    }
}