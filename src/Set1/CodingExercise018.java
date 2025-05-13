package Set1;

public class CodingExercise018 {
    public static void main(String[] args) {
    PerfectNumberChecker n = new PerfectNumberChecker();
        System.out.println(n.isPerfectNumber(6));
        System.out.println(n.isPerfectNumber(28));
        System.out.println(n.isPerfectNumber(27));
    }
}

class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; //add divisor
            }
        }
        return sum == number;
    }
}