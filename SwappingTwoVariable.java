package org.practice;

public class SwappingTwoVariable {

	public static void main(String[] args) {
		
//		how to swapping the data to another variable !!
		
		int mySalary = 10000;
		
		int myCoWorkerSalary = 20000;
		
		int tempSalary = mySalary;
		
		 mySalary = myCoWorkerSalary;  
		 
		 myCoWorkerSalary = tempSalary;
		 
		 
		 System.out.println("MySalary :" + mySalary + "My Co-Worker Salary :" + myCoWorkerSalary);

	}

}
