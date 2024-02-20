import java.util.Scanner;

public class Baitap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println(" Please enter student " + i + " 's HTML score: ");
            double htmlScore = scanner.nextDouble();

            System.out.println(" Please enter student " + i + " 's CSS score: ");
            double cssScore = scanner.nextDouble();

            System.out.println(" Please enter student " + i + " 's JS score: ");
            double jsScore = scanner.nextDouble();

            double avgScore = (htmlScore + cssScore + jsScore) / 3;

            System.out.print("Student " + i + " 's average is: " + avgScore );
            if (avgScore < 5) {
                System.out.println("Weak");
            } else if (avgScore < 7) {
                System.out.println("Average");
            } else if (avgScore < 9) {
                System.out.println("Good");
            } else {
                System.out.println("Excellent");
            }
        }
        scanner.close();
    }
}
