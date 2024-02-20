import java.util.Scanner;

public class Baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }
        scanner.close();
    }
}
