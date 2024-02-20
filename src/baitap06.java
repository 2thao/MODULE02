import java.util.Scanner;

public class baitap06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count = 0;
        int n = 2;
        System.out.printf("%d of the first number is: ", num);
        while (count < num){
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if (check){
                System.out.print(n +",");
                count++;
            }
            n++;
        }

    }
}
