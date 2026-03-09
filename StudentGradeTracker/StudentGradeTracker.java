import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int mark = sc.nextInt();
            sc.nextLine();

            names.add(name);
            marks.add(mark);
        }

        int highest = marks.get(0);
        int lowest = marks.get(0);
        int sum = 0;

        for (int m : marks) {

            if (m > highest) {
                highest = m;
            }

            if (m < lowest) {
                lowest = m;
            }

            sum += m;
        }

        double average = (double) sum / marks.size();

        System.out.println("\n----- Student Report -----");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " : " + marks.get(i));
        }

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}