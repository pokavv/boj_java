package Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class adv_25206 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sumNumScore = 0;
        double sumNum = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String obj = st.nextToken();
            double num = Double.parseDouble(st.nextToken());
            String alp = st.nextToken();
            double score = 0;

            // P가 아닐 때만 체크
            if (!(alp.equals("P"))) {
                switch (alp) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                    default:
                        break;
                }

                sumNumScore += (num + score);
                sumNum += num;
            }
        }

        // 소수점 아래 6자리까지 출력
        System.out.printf("%.6f", sumNumScore/sumNum);
        br.close();
    }
}
