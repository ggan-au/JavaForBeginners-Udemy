package Set1;

public class CodingExercise008 {
    public static void main(String[] args) {
        System.out.println(ExamResult.isPass(30));
        System.out.println(ExamResult.isPass(55));
    }
}

class ExamResult {
    public static boolean isPass(int marks) {
        return marks > 50;
    }
}
