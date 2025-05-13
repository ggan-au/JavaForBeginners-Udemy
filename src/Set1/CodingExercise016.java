package Set1;

public class CodingExercise016 {
    public static void main(String[] args) {
    LeapYearChecker leap = new LeapYearChecker();
        System.out.println(leap.isLeapYear(2004));
        System.out.println(leap.isLeapYear(2400));
        System.out.println(leap.isLeapYear(2001));
    }
}

class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year < 1) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}