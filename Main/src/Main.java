import java.util.*;

public class Main {

    // Helper to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Helper to count vowels in a list of city names
    static int countVowels(List<String> cities) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (String city : cities) {
            for (char ch : city.toCharArray()) {
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }
        }
        return count;
    }

    // Helper to calculate sum of digits of a number
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input cities
        int n = Integer.parseInt(sc.nextLine());
        String[] citiesInput = sc.nextLine().split(" ");
        List<String> cities = Arrays.asList(citiesInput);

        // Step 1: Find longest non-repeating route
        Map<String, Integer> seen = new HashMap<>();
        int start = 0, maxLen = 0, bestStart = 0;

        for (int end = 0; end < cities.size(); end++) {
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

        List<String> bestRoute = cities.subList(bestStart, bestStart + maxLen);
        System.out.print("Most efficient delivery route: ");
        for (String city : bestRoute) {
            System.out.print(city + " ");
        }
        System.out.println();

        // Step 2: Read invoice IDs
        int m = Integer.parseInt(sc.nextLine());
        String[] invoicesInput = sc.nextLine().split(" ");
        List<Integer> invoices = new ArrayList<>();
        for (String id : invoicesInput) {
            invoices.add(Integer.parseInt(id));
        }

        // Count vowels in best route
        int vowelCount = countVowels(bestRoute);

        // Validate invoices
        List<Integer> validInvoices = new ArrayList<>();
        for (int id : invoices) {
            int digitSum = sumOfDigits(id);
            if (isPrime(digitSum) || (vowelCount != 0 && id % vowelCount == 0)) {
                validInvoices.add(id);
            }
        }

        System.out.print("Valid priority invoices:");
        for (int val : validInvoices) {
            System.out.print(" " + val);
        }
        System.out.println();
    }
}
