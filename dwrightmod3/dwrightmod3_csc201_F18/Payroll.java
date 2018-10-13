package dwrightmod3_csc201_F18;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Payroll {

	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double hoursWorked;
	
	public Payroll() {
		
	}
	public Payroll(String name, int idNumber, double hourlyPayRate, double hoursWorked) {
		this.name = name;
		this.idNumber = idNumber;
		this.hourlyPayRate = hourlyPayRate;
		this.hoursWorked = hoursWorked;
	}
	public double grossPay() {
		double payBeforeTax;
		payBeforeTax = hourlyPayRate * hoursWorked;
		return payBeforeTax;
	}
	public double netPay() {
		double payAfterTax;
		payAfterTax = grossPay() - (grossPay() * .05);
		return payAfterTax;
	}
	public String toString() {
		NumberFormat mon = DecimalFormat.getCurrencyInstance();
		
		return "Name: " + name + "\nIDNumber: " + idNumber + "\nHourly Pay: " + mon.format(hourlyPayRate) + "\nHours Worked: " 
	+ hoursWorked + "\nGross Pay: " + mon.format(grossPay()) + "\nNet Pay: " + mon.format(netPay());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}
