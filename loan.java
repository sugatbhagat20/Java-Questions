package com.pack1;

class loan{
	
	public double calculateLoanAmount(Employee1 e)
	{
		if(e instanceof PermanentEmployee)
		{
			return e.calculateSalary()*(15.0/100);
			
		}
		if(e instanceof TemporaryEmployee)
		{
			return e.calculateSalary()*(10.0/100);
			
		}
		return 0;
	}

}
