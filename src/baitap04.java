import java.util.Scanner;
public class baitap04 {
    public static void main(String[] args) {
        int a, b, sum = 0;
        Scanner first = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.println("Enter the second number:");
        b = second.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Total of odd number ranges from first to second number is: " + sum);
    }
}
