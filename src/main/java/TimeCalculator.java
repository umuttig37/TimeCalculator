public class TimeCalculator {
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }

    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();

        double distance = 120.0; //km
        double speed = 60.0;     // km/h
        double time = calculator.calculateTime(distance, speed);
        System.out.println("Time to reach: " + time + " hours");
    }
}
