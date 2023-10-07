package InputOutput.buddhistcalendar;

import java.util.Scanner;

// boj 18108
// Scanner 사용
public class buddCalendarV1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int buddYear = scanner.nextInt();

        System.out.println(buddYear - 543);

        scanner.close();
    }
}
