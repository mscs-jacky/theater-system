package TheaterSystem.UserInterface;

import TheaterSystem.Controllers.Controller;
import TheaterSystem.Controllers.EmployeeFactory;
import TheaterSystem.Models.Employee;

import java.util.ArrayList;
import java.util.Scanner;
public class UI {
    public static void main(String[] args)
    {
        ArrayList<Employee> employees = new ArrayList<>();
        Controller controller = Controller.getInstance();
        addEmployees(employees);
        for(int i = 0; i < employees.size(); i++) {
            employees.get(i).getEmployeeDetails();
            System.out.println();
        }

//        TODO: Example for employee interface to clockin/clockout with other methods
        for(Employee employee: employees) {
            if(employee.getEmployeeId().equalsIgnoreCase("userInput")) {
//                Clock in, clockout, etc...
            }
        }
//        employees.get(0).clockIn();
//        addEmployees(employees);
//        employees.get(0).clockOut();
//        employees.get(0).payCheck();
//        employees.get(0).getEmployeeDetails();
    }

    public static void addEmployees(ArrayList<Employee> employees) {
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
                    employees.add(employee);
                    System.out.print("Employee Added.\nWhat employee type (M/A) (Q to Exit): ");
                } else {
                    System.out.print("What employee type (M/A) (Q to Exit): ");
                }
            }
        }

    }
}
