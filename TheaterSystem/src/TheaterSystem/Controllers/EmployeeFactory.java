package TheaterSystem.Controllers;

import TheaterSystem.Models.Attendant;
import TheaterSystem.Models.Employee;
import TheaterSystem.Models.Manager;
import java.util.Scanner;

public class EmployeeFactory {
    public Employee makeEmployee(String employeeType) {
        Employee newEmployee = null;
        String firstName = null;
        String lastName = null;
        double minWage = 15;
        Scanner userInput = new Scanner(System.in);
        if(employeeType.equalsIgnoreCase("m")) {
            System.out.print("First Name: ");
            if(userInput.hasNextLine()) {
                firstName = userInput.nextLine();
            }
            System.out.print("Last Name: ");
            if(userInput.hasNextLine()) {
                lastName = userInput.nextLine();
            }
            return new Manager(firstName, lastName, minWage*1.75);
        }
        else if (employeeType.equalsIgnoreCase("a")){
            System.out.print("First Name: ");
            if(userInput.hasNextLine()) {
                firstName = userInput.nextLine();
            }
            System.out.print("Last Name: ");
            if(userInput.hasNextLine()) {
                lastName = userInput.nextLine();
            }
            return new Attendant(firstName, lastName, minWage);
        } else {
            System.out.println("[INVALID EMPLOYEE CODE] Please try again.");
            return null;
        }
    }
}
