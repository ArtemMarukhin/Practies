package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//        int weight;
//        int height;

        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        int height = scanner.nextInt();

        double iom = (double) weight /(height^2);

        if (iom < 18.5) {
            System.out.println("warning min");
        } else if (iom > 25){
            System.out.println("warning max");
        } else System.out.println("normal");


    }
}
