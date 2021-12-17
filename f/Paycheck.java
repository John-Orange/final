package com.Final;

public class Paycheck implements Payroll{
	
	private double hours;
	private double rate;
	private double regPay;
	private double overtimePay;
	private double TotalPay;
	
	public Paycheck() {
		hours = 0.0;
		rate = 0.0;
	}
	
	public Paycheck(double Hours, double Rate) {
		this.hours = Hours;
		this.rate = Rate;
		this.regPay = regularPay();
		this.overtimePay = overTimepay();
		this.TotalPay = totalPay();
	}
	
	
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	public double getHours() {
		return hours;
	}
	
	public double getRate() {
		return rate;
	}
	
	
	@Override
	public double regularPay() {
		if (hours <= 40) {
			regPay = (hours * rate);
		}else 
			regPay = (rate * 40);
			
		return regPay;
	}

	@Override
	public double overTimepay() {
		if (hours > 40) {
			overtimePay =((hours - 40) * rate * 1.5);
		} else
			overtimePay = 0;
		return overtimePay;
	}

	@Override
	public double totalPay() {
		TotalPay = (overtimePay + regPay);
		return TotalPay;
	}
	
	public void printInfo() {
		System.out.println("Regular paycheck would be: $" + regPay);
		System.out.println("Overtime paycheck would be: $" + overtimePay);
		System.out.println("Total paycheck would be: $" + TotalPay);
		
	}

		


}
