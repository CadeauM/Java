public class prime_number{
    public static void main(String[] args) {
        int count = 0;

        for ( int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number" + i + "is prime");
                count++;
            }
        }
    }
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber == 1) {
            return false;
        }
        for (int divisor = 2; divisor <= wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }

        }
        return true;
    }
}