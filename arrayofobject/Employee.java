import java.util.Scanner;

/**
 * Employee
 */
public class Employee {

    int id;
    String name;
    int age;
    long salary;

    void getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter Employee Id:");
        id = Integer.parseInt(scan.nextLine());
        System.out.println("\nEnter Employee Name:");
        name = scan.nextLine();
        System.out.println("\nEnter Employee age:");
        age = Integer.parseInt(scan.nextLine());
        System.out.println("\nEnter Employee salary:");
        salary = Integer.parseInt(scan.nextLine());
    }

    void putData() {
        System.out.println(" " + id + " " + name + " " + age + " " + salary);
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        int i;
        for (i = 0; i < 3; i++)
            emp[i] = new Employee();
        for (i = 0; i < 3; i++) {
            System.out.println("\nEmployee Details Of " + (i + 1) + " Employee\n");
            emp[i].getData();
        }
        System.out.println("Details Of Employee");
        for(i=0;i<3;i++)
        emp[i].putData();
    }
}