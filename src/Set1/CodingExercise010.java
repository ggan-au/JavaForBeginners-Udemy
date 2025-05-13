package Set1;

public class CodingExercise010 {
    public static void main(String[] args) {
        System.out.println(TriangleValidator.isValidTriangle(-1,30,40));
        System.out.println(TriangleValidator.isValidTriangle(60,60,60));
    }
}

class TriangleValidator {
    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            return false;
        }

        int sum = angle1 + angle2 + angle3;
        return sum == 180;
    }
}
