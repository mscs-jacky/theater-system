package TheaterSystem.UserInterface;

import TheaterSystem.Controllers.Controller;
import TheaterSystem.Controllers.EmployeeFactory;
import TheaterSystem.Models.Employee;

import java.util.ArrayList;
import java.util.Scanner;
public class UI {
    public static void main(String[] args)
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Controller controller = Controller.getInstance();

        EmployeeFactory employeeFactory = new EmployeeFactory();


        Scanner uInput = new Scanner(System.in);
        System.out.print("What employee type (M/A) (Q to Exit): ");
        while(true) {
            if (uInput.hasNextLine()) {
                Employee employee = null;
                String uIn = uInput.nextLine();
                if(uIn.equalsIgnoreCase("q")) break;
                employee = employeeFactory.makeEmployee(uIn);
                if (employee != null) {
//                    employee.getEmployeeDetails();
                    employees.add(employee);
                    System.out.print("Employee Added.\nWhat employee type (M/A) (Q to Exit): ");
                }
            }

        }
        for(int i = 0; i < employees.size(); i++) {
            employees.get(i).getEmployeeDetails();
            System.out.println();
        }
    }
}
