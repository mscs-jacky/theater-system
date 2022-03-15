package TheaterSystem.Models;

import java.util.Date;
import java.text.DecimalFormat;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private double accumulatedWorkHours;
    private double unpaidWorkHours;
    private double earnedWage;
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

    public double getEarnedWage() {
        return earnedWage;
    }

    public void setEarnedWage(double earnedWage) {
        this.earnedWage = earnedWage;
    }

    public double getUnpaidWorkHours() {
        return unpaidWorkHours;
    }

    public void setUnpaidWorkHours(double unpaidWorkHours) {
        this.unpaidWorkHours = unpaidWorkHours;
    }

    public void clockIn() {
        setTimeStart(new Date());
    }

    public void clockOut() {
        if(getTimeStart() != null) {
            Date endShift = new Date();
            double hoursWorked = (endShift.getTime() - getTimeStart().getTime())/1000.0;
            setTimeStart(null);
            setAccumulatedWorkHours(getAccumulatedWorkHours() + hoursWorked);
            setUnpaidWorkHours(getUnpaidWorkHours() + hoursWorked);
        }
    }

    public void payCheck() {
        double check = roundCurrency(getUnpaidWorkHours() * getPayRate());
        setEarnedWage(roundCurrency(getEarnedWage() + check));
        setUnpaidWorkHours(0);
//        System.out.println("Check:         $" + check);
//        System.out.println("Total Earned: $" + getEarnedWage());
    }

    private double roundCurrency(double currency) {
        return Double.parseDouble(String.format("%.2f", currency));
    }

    public void getEmployeeDetails() {
        System.out.println("Name:         " + getName());
        System.out.println("Employee ID:  " + getEmployeeId());
        System.out.println("Pay Rate:     " + getPayRate());
        System.out.println("Hours Worked: " + getAccumulatedWorkHours());
        System.out.println("Total Pay:    $" + getEarnedWage());
    }

    public String getEmployeeType() {
        return null;
    }
}
