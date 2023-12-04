package Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class geo_3009 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] coordA = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] coordB = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] coordC = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x;
        int y;
        if (coordA[0] == coordB[0]) {
            x = coordC[0];
        } else if (coordA[0] == coordC[0]) {
            x = coordB[0];
        } else {
            x = coordA[0];
        }

        if (coordA[1] == coordB[1]) {
            y = coordC[1];
        } else if (coordA[1] == coordC[1]) {
            y = coordB[1];
        } else {
            y = coordA[1];
        }

        System.out.println(x + " " + y);
    }
}
