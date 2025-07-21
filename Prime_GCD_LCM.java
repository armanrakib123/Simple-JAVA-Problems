public class Prime_GCD_LCM{

    // GCD using Euclidean Algorithm
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // LCM using GCD
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Prime Check O(√n)
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is 17 prime? " + isPrime(17));   // true
        System.out.println("GCD of 48 and 18: " + gcd(48, 18)); // 6
        System.out.println("LCM of 4 and 6: " + lcm(4, 6));     // 12
    }
}
