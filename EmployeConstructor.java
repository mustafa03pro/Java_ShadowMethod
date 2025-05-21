package com.may12;

public class EmployeConstructor 
{
	private String  firstName;   	 
	private String  lastName ;     	
	private int employeeId; 	 
	private double  salary;  	
	private int  NoOfProject 	;
	public EmployeConstructor(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		NoOfProject = noOfProject;
	}
	@Override
	public String toString() {
		return "EmployeConstructor [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", NoOfProject=" + NoOfProject + "]";
	}
	
	public void calculateSalary() {
		if(NoOfProject<=0) {
			System.err.println("project should be grattter than 0 salary remains"+salary);
			System.exit(0);
		}
		else {
			if(NoOfProject>5&&NoOfProject<10) {
				salary+=5000;
				System.out.println("your salary after increment "+ salary);
				System.exit(0);
			}
			else if(NoOfProject>=10&&NoOfProject<=15) {
				salary+=10000;
				System.out.println("your salary after increment "+ salary);
				System.exit(0);
				
			}
			else if(NoOfProject>15&&NoOfProject<=20) {
				salary+=15000;
				System.out.println("your salary after increment "+ salary);
				System.exit(0);
				
			}
			
			
		}
	}
}
