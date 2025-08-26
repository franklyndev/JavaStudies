import vetores.exercises.classes.vetores.EmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be entered: ");
        int n = sc.nextInt();

        List<EmployeeList> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            EmployeeList emp = new EmployeeList(id, name, salary);
            list.add(emp);
        }

        System.out.print("Enter the employee ID that will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = hasId(list, idsalary);
        if (pos == null) {
            System.out.println("That id doesn't exist");
        } else {
            System.out.print("Enter the increase: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("List of employees: ");
        for (EmployeeList oi : list){
            System.out.print(oi);
        }

        sc.close();
    }

    public static Integer hasId(List<EmployeeList> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
