package lesson;

import java.util.Scanner;

public class AgeTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yaşınızı daxil edin: ");
        int age = sc.nextInt();

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Yaş düzgün deyil!");
        }
        System.out.println("Yaşınız: " + age);
    }
}
