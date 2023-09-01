public class main {

    public static int addNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int addNumbersDifferent(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + addNumbersDifferent(numbers, index + 1);
    }

    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("Sum using addNumbers: " + addNumbers(numbers));
        System.out.println("Sum using addNumbersDifferent: " + addNumbersDifferent(numbers, 0));
        System.out.println("Max number: " + findMax(numbers));
        System.out.println("Factorial iterative: " + factorialIterative(5));
        System.out.println("Factorial recursive: " + factorialRecursive(5));
        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Reverse 'hello': " + reverseString("hello"));
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome("racecar"));
        System.out.println("Fibonacci(5) iterative: " + fibonacciIterative(5));
        System.out.println("Fibonacci(5) recursive: " + fibonacciRecursive(5));
    }
}
