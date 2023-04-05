public class PrimeNumber {
    public static void main(String[] args) {
        int number = 2;

        boolean isprime = true;

        if (number == 1) {
            System.out.println("Sayı asal değil !!");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı !!");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isprime = false;
            }
        }

        if (isprime) {
            System.out.println("Sayı asal");
        } else {
            System.out.println("Sayı asal değil !!");
        }
    }
}
