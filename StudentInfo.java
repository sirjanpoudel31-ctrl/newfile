public class StudentInfo {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide name and age.");
            return;
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
