package com.unittest.testing;

public class Fahrenheit {

	private double celcius;
	public double getCelcius() {
		return celcius;
	}
	public void input (double celcius) {
		this.celcius = celcius;
	}
	public boolean isBound(double celcius) {
		boolean isResult;
		if (celcius <= 1000 && celcius>=-1000) {
			isResult = true;
		}else {
			isResult = false;
		}
		return isResult;
	}
	 public double calculate() {
		 double Fahrenheit = this.celcius*9/5+32;
		 return Fahrenheit;
	 }
	 public String toString() {
//		 $number celcius = $number Fahrenheit
		 double Fahrehgeit = this.calculate();
		 double celcius = this.getCelcius();
		 return Math.round(celcius)+" celcius = "+ Math.round(Fahrehgeit)+" Fahrenheit";
	 }
}