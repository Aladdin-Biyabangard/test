package lesson;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Bir rəqəm daxil edin: ");
            int num = sc.nextInt();
            System.out.println("Daxil etdiyiniz rəqəm: " + num);
        }
    }
}
