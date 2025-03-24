package com.pack1;
//Employee Salary and Loan Calculation System
//
//You are required to develop a Java program that models an employee salary and loan calculation system. Implement the following classes with the specified functionality:
//
//1. Abstract Class: Employee
//Attributes:
//employeeId: An integer representing the employee’s ID.
//employeeName: A string representing the employee’s name.
//salary: A double representing the employee’s salary.
//Constructor:
//A 2-argument constructor to initialize employeeId and employeeName.
//Methods:
//Getter and setter methods for all attributes.
//An abstract method calculateSalary() to be implemented in subclasses.
//2. Class: PermanentEmployee (Inherits from Employee)
//Additional Attribute:
//basicPay: A double representing the base salary of a permanent employee.
//Constructor:
//A 3-argument constructor initializing employeeId, employeeName, and basicPay.
//Implements calculateSalary():
//Salary is calculated as basicPay - (12% of basicPay).
//3. Class: TemporaryEmployee (Inherits from Employee)
//Additional Attributes:
//hoursWorked: An integer representing the number of hours worked.
//hourlyWages: An integer representing the wage per hour.
//Constructor:
//A 4-argument constructor initializing employeeId, employeeName, hoursWorked, and hourlyWages.
//Implements calculateSalary():
//Salary is calculated as hoursWorked * hourlyWages.
//4. Class: Loan
//Method:
//public double calculateLoanAmount(Employee employeeObj):
//If the employee is a PermanentEmployee, loan amount = 15% of salary.
//If the employee is a TemporaryEmployee, loan amount = 10% of salary.
//5. Class: Main
//Accepts user input to create instances of PermanentEmployee or TemporaryEmployee.
//Calls calculateSalary() and displays the employee’s details and loan amount



public class LoanCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new PermanentEmployee(1,"Sugat",5000.00);
		Employee1 e2=new TemporaryEmployee(2,"Akash",50,50);
		loan l=new loan();
	
		
		System.out.println(l.calculateLoanAmount(e2));
		//l.calculateLoanAmount(e1);

	}

}
