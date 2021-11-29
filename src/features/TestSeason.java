package features;

import java.util.Scanner;

public class TestSeason {
    public static void main(String[] args) {
        System.out.println("Enter Season ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Season[] seasons = Season.values();
        boolean st = false;
        for (Season s:seasons
             ) {
            if(s.toString().equalsIgnoreCase(input)){
                System.out.println("Valid Season ! ");
                st = true;
                break;
            }
        }
        if (st == false){
            System.out.println("Not Found");
        }
    }
}
