package TheaterSystem.Models;

import java.util.UUID;

public class Manager extends Employee{
    public Manager(String firstName, String lastName, double payRate) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeId(String.valueOf(UUID.randomUUID()));
        setEmployeePassword(String.valueOf(UUID.randomUUID()));
        setPayRate(payRate);
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Name:          " + getName());
        System.out.println("Employee Type: Manager");
        System.out.println("Employee ID:   " + getEmployeeId());
        System.out.println("Pay Rate:      " + getPayRate());
        System.out.println("Hours Worked:  " + getAccumulatedWorkHours());
        System.out.println("Total Pay:     $" + getEarnedWage());
    }

    @Override
    public String getEmployeeType() {
        return "m";
    }
}
