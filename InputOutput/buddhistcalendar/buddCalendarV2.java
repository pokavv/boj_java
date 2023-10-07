package InputOutput.buddhistcalendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 18108 boj
// BufferedReader 사용
public class buddCalendarV2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int buddYear = Integer.parseInt(str);

        System.out.println(buddYear - 543);
    }
}
