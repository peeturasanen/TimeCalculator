import java.util.Scanner;

public class TimeCalculator {
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter speed: ");
        double speed = scanner.nextDouble();

        TimeCalculator calculator = new TimeCalculator();
        try {
            double time = calculator.calculateTime(distance, speed);
            System.out.println("Time required: " + time + " hours");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}