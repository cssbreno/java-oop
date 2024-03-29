package course;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b00100000;
        int n = sc.nextInt();

        String result = ((n & mask) != 0) ? "6th bit is true" : "6th bit is false";

        System.out.println(result);
        sc.close();
    }
}