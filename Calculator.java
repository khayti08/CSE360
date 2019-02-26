// Name: Khyati Raka
// Class ID: 530
//Assignment number 2
// Description: This program is designed to perform basic functions such as addition, subtraction, multiplication and division.



package cse360assign2;

public class Calculator {
private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return 0;
	}
	
	public void add (int value) {
		total += value;
	}
	
	public void subtract (int value) {
		total -= value;
	}
	
	public void multiply (int value) {
		total *= value;
	}
	
	public void divide (int value) {
	
		if ( value != 0) {
			total /= value;
		}
		
		else {
			total = 0;
		}
		
	
	}
	
	public String getHistory () {
		return "";
	}

}
