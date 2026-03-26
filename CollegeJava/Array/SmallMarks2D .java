public class SmallMarks2D {
    public static void main(String[] args) {

        // 2 students × 2 subjects: Nepali, English
        int[][] marks = {
            {80, 75},   // Student 1
            {90, 85}    // Student 2
        };

        // Print header
        System.out.println("Student\tNepali\tEnglish");
        
        // For each student (row)
        for (int i = 0; i < 2; i++) {
            int total = 0;
            System.out.print("S" + (i + 1) + "\t");
            for (int j = 0; j < 2; j++) {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
            }
            System.out.println("Total = " + total);
        }
    }
}
