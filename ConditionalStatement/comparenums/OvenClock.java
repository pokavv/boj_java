package ConditionalStatement.comparenums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OvenClock {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int hour = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[1]);
        int cookingTime = Integer.parseInt(br.readLine());

        int minSum = 60 * hour + min; // 시 -> 분
        minSum += cookingTime; // + 조리 시간

        int resHour = (minSum / 60) % 24; // 시(hour)는 0 ~ 23시, 24 이상일 땐 다시 0시 가 되어야 함 (나머지 연산 % 24)
        int resMin = minSum % 60;

        System.out.println(resHour + " " + resMin);
    }
}
