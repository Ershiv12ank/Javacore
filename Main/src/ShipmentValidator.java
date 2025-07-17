import java.util.*;

public class ShipmentValidator {

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to count vowels in all city names
    static int countVowels(List<String> cities) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (String city : cities) {
            for (char ch : city.toCharArray()) {
                if (vowels.indexOf(ch) != -1) count++;
            }
        }
        return count;
    }

    // Function to find sum of digits
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input cities
        int n = Integer.parseInt(sc.nextLine());
        String[] citiesInput = sc.nextLine().split(" ");
        List<String> cities = Arrays.asList(citiesInput);

        // Step 1: Find longest subarray with unique cities
        Map<String, Integer> seen = new HashMap<>();
        int start = 0, maxLen = 0, bestStart = 0;

        for (int end = 0; end < n; end++) {
            String city = cities.get(end);
            if (seen.containsKey(city) && seen.get(city) >= start) {
                start = seen.get(city) + 1;
            }
            seen.put(city, end);
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                bestStart = start;
            }
        }

        List<String> bestRoute = cities.subList(best
