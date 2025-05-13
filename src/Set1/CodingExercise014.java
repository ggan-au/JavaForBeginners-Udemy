package Set1;

public class CodingExercise014 {
    public static void main(String[] args) {
        SumOfSquares calculator = new SumOfSquares();
        System.out.println(calculator.calculateSumOfSquares(5));
        System.out.println(calculator.calculateSumOfSquares(0));
        System.out.println(calculator.calculateSumOfSquares(-5));
    }
}

class SumOfSquares {
    public long calculateSumOfSquares(int n) {
        if (n < 0){
            return -1;
        }

        long sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }
}