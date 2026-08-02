package chap5practice;

public class AverageMarksArray {
    public static float avgPhysicsMarks(int[] array) {
        int total = 0;
        float n = (float) array.length;

        for (int marks: array) {
            total += marks;
        }

        return (Math.round((total/n) * 100)/100.0f);
    }

    public static void main(String[] args) {
        System.out.println("Average of physics marks is: " + avgPhysicsMarks(new int[]{99, 96, 97, 93, 89, 90, 87, 86}));
    }
    
}
