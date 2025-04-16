public class Loops {
    public static void main(String[] args) {
        for (double i = 7.5; i <= 10; i += 0.25) {
            double interestAmount = calculateInterest(100, i);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("R100 at " + i + "% interest = R" + interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interestAmount) {
        return (amount * (interestAmount/ 100));
    }
}