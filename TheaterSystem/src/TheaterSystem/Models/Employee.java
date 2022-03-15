package TheaterSystem.Models;

import java.util.Date;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private double accumulatedWorkHours;
    private String employeeId;
    private String employeePassword;
    private double payRate;
    private Date timeStart;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAccumulatedWorkHours() {
        return accumulatedWorkHours;
    }

    public void setAccumulatedWorkHours(double accumulatedWorkHours) {
        this.accumulatedWorkHours = accumulatedWorkHours;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    public void sayHi() {
        System.out.println(getName() + " says hi!");
    }

    public void clockIn() {

    }

    public void clockOut() {

    }

    public void getEmployeeDetails() {
        System.out.println("Name:         " + getName());
        System.out.println("Employee ID:  " + getEmployeeId());
        System.out.println("Pay Rate:     " + getPayRate());
        System.out.println("Hours Worked: " + getAccumulatedWorkHours());
        System.out.println("Total Pay:    " + getPayRate()*getAccumulatedWorkHours());
    }

    public void getEmployeeType() {}
}
