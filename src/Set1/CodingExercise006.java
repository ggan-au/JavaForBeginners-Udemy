package Set1;

public class CodingExercise006 {
    public static void main(String[] args) {
        System.out.println(TimeConverter.convertDaysToMinutes(1));
        System.out.println(TimeConverter.convertHoursToMinutes(-7));
    }
}

class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
    return hours < 0 ? -1 : hours * 60;
    }

    public static int convertDaysToMinutes(int days) {
    return days < 0 ? -1 : days * convertHoursToMinutes(24);
    }
}
