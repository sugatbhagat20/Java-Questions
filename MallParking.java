package com.problems;

import java.time.LocalTime;
import java.util.Scanner;

public class MallParking {
	 static int hourly_rate = 10;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			LocalTime inTime=LocalTime.parse(s.next());
			LocalTime outTime=LocalTime.parse(s.next());
			System.out.println(inTime);
			int inHour = inTime.getHour();
	        int inMinute = inTime.getMinute();
	        int outHour = outTime.getHour();
	        int outMinute = outTime.getMinute();

	        int totalHours = outHour - inHour;
	        int totalMinutes = outMinute - inMinute;

	        
	        if (totalMinutes < 0) 
	        {
	            totalMinutes += 60;
	            totalHours -= 1;
	        }
	        
	     
	        int totalCharge = totalHours * hourly_rate;

	        if (totalMinutes > 0) 
	        {
	            totalCharge += hourly_rate; 
	        }

	        System.out.println("Total Parking Fee: ₹" + totalCharge);
		    
		
	}

}
