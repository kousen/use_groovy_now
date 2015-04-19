package nfjs.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter some numbers to sum");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int total = 0;
        try {
            String line = br.readLine();
            for (String s : line.split(" ")) {
                total += Integer.parseInt(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The total is " + total);
    }
}
