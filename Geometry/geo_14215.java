package Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class geo_14215 {


    /**
     * 가장 긴 변의 길이가 다른 변의 길이의 합보다 작아야 한다
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Comparator.naturalOrder());

        if (list.get(0) + list.get(1) > list.get(2)) {
            System.out.println(list.get(0) + list.get(1) + list.get(2));
        } else {
            System.out.println((list.get(0) + list.get(1)) * 2 - 1);
        }
    }
}
