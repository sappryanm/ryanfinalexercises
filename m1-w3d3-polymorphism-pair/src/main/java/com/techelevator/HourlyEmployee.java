package com.techelevator;

public class HourlyEmployee implements WorkerInterface {

private String firstName;
private String lastName;
private String fullName;
private double rate;
private double weeklyPay;
private int hoursWorked;
public HourlyEmployee() {
    
}

public HourlyEmployee(String firstName, String lastName, double rate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.rate = rate;
    this.hoursWorked = (int )(Math.random() * 50 + 1);
}

public String getFirstName() {
    return firstName;
}

@Override
public String getName() {
    fullName = lastName + ", " + firstName;
    return fullName;
}

@Override
public int getHoursWorked() {
    return hoursWorked;
}

public double getRate() {;
    return rate;
}

public double weeklyPay() {
    if (getHoursWorked() > 40) {
        this.weeklyPay = (((getHoursWorked() - 40) * rate * 1.5) + (40 * rate));
        return weeklyPay;
        } else {
        this.weeklyPay = rate * getHoursWorked();
        return weeklyPay;
    }
}

@Override
public double getPay() {
    weeklyPay();
    return weeklyPay;
}
}
