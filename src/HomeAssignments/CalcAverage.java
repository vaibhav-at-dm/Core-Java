package HomeAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcAverage {
    public double avgFirstN(int n) {
        if (n <= 0) {
            try {
                throw new IllegalArgumentException("Please Enter a natural number ");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            return 0;
        } else {
            return (n * (n + 1) / 2) / 2;
        }
    }

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        CalcAverage c = new CalcAverage();
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(c.avgFirstN(n));
    }
}

//class IllegalArgumentException extends RuntimeException {
//    IllegalArgumentException(String msg) {
//
//        super(msg);
//    }
//}

