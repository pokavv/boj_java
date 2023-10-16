package OneDimensionalArray.assignment;

import java.io.*;

public class SubmissionConfirm {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] student = new int[31];

        for (int i = 1; i < 29; i++) {
            int submit = Integer.parseInt(br.readLine());
            student[submit] = 1;
        }

        for (int i = 1; i < student.length; i++) {
            if (student[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
