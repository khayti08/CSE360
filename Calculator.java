// Name: Khyati Raka
// Class ID: 530
//Assignment number 2
// Description: This program is designed to perform basic functions such as addition, subtraction, multiplication and division.



package cse360assign2;

public class Calculator {
private int total;
private String history = "0";
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () //returns total before any functions are called
	{  
		return 0;
	}
	
	public  void add (int value)  //adds a value to the total
	{ 
		total += value;
		history += "+"  + value;
	
	}
	
	public void subtract (int value)  //subtracts a value to the total
	{    
		total -= value;
		history += "-"  + value;
	}
	
	public void multiply (int value) {  //multiplies a value to the total
		total *= value;
		history += "*"  + value;
	}
	
	public void divide (int value) {    //divides a value to the total
	
		if ( value != 0)   //checks to see if the value entered is 0 or not
		{    
			total /= value;
			
		}
		
		else 
		{
			total = 0;
		}
		
		history += "/"  + value;
	}
	
	public String getHistory () {    //returns the history 
		return history;
	}





}

