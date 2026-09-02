import java.util.Scanner;

public class StudentInfo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\n--- Student Information ---");
        System.out.println("Name      : " + name);
        System.out.println("Roll No.  : " + rollNo);
        System.out.printf("CGPA      : %.2f%n", cgpa);

        sc.close();
    }
}
