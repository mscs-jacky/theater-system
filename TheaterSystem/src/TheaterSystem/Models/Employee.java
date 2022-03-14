package TheaterSystem.Models;

import java.util.Date;

public class Employee extends Person{
    private double workHours;
    private String employmentStatus;
    private Date employmentStart;
    private Date employmentEnd;

    public Employee(String firstName, String lastName, double workHours, String employmentStatus, Date employmentStart, Date employmentEnd) {
        setFirstName(firstName);
        setLastName(lastName);
        this.workHours = workHours;
        this.employmentStatus = employmentStatus;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Date getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(Date employmentStart) {
        this.employmentStart = employmentStart;
    }

    public Date getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(Date employmentEnd) {
        this.employmentEnd = employmentEnd;
    }
}
