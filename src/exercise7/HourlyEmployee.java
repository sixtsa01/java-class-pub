/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author sixtsa01
 */
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;
    
    public HourlyEmployee(String name, String ssn, double wageRate, double hours) {
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public double getNetPay() {
        return netPay;
    }
    
    public void printWeeklyCheck() {
        double weekly_check = 0;
        weekly_check = hours * wageRate / 52;
        System.out.print(weekly_check);
    }
}
