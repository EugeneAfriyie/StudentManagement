package Array_operations;

public class StudentGrades {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 90, 75, 85},
            {70, 60, 65, 75},
            {95, 88, 92, 90}
        };

        for (int i = 0; i < marks.length; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            double avg = (double) sum / marks[i].length;
            System.out.println("Student " + (i + 1) + " average: " + avg);
        }
    }
}
