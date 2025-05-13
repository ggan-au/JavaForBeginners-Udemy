package Set1;

import java.util.Arrays;

public class CodingExercise012 {
    public static void main(String[] args) {
        System.out.println(TriangleValidatorRightAngle.isRightAngle(3,4,5));
        System.out.println(TriangleValidatorRightAngle.isRightAngle(5,12,13));
        System.out.println(TriangleValidatorRightAngle.isRightAngle(3,3,3));
    }
}

class TriangleValidatorRightAngle {
    public static boolean isRightAngle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        int[] myarray = {side1, side2, side3};
        Arrays.sort(myarray);
        int a = myarray[0]; //smallest
        int b = myarray[1]; //middle
        int c = myarray[2]; //largest

        return a * a + b * b == c * c;
    }
}
