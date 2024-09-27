public class TimeCalculator {
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide distance and speed as command-line arguments.");
            return;
        }

        double distance = Double.parseDouble(args[0]);
        double speed = Double.parseDouble(args[1]);

        TimeCalculator calculator = new TimeCalculator();
        try {
            double time = calculator.calculateTime(distance, speed);
            System.out.println("Time required: " + time + " hours");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}