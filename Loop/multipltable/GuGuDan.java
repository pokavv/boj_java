package Loop.multipltable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGuDan {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
