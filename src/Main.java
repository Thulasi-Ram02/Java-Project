import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        StudentDAO dao=new StudentDAO();

        while(true){

            System.out.println("\n===== Student Management System =====");

            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Update Student Course");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");

            System.out.print("Choose: ");

            int choice=sc.nextInt();

            switch(choice){

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");

                    String name=sc.nextLine();

                    System.out.print("Enter Age: ");

                    int age=sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course: ");

                    String course=sc.nextLine();

                    dao.addStudent(new Student(name,age,course));

                    break;

                case 2:

                    dao.viewStudents();

                    break;

                case 3:

                    System.out.print("Student ID: ");

                    int id=sc.nextInt();

                    sc.nextLine();

                    System.out.print("New Course: ");

                    String c=sc.nextLine();

                    dao.updateStudent(id,c);

                    break;

                case 4:

                    System.out.print("Student ID: ");

                    int d=sc.nextInt();

                    dao.deleteStudent(d);

                    break;

                case 5:

                    System.out.println("Thank You");

                    System.exit(0);

            }

        }

    }

}
