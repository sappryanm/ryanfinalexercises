package com.techelevator;

//import com.techelevator.WorkerInterface.java;

public class EmployeeInfo {


		public static void main(String[] args) {
			System.out.println("Employeee            Hours           Pay");
			WorkerInterface[] workers = new WorkerInterface[] { new Salaried() ,new HourlyEmployee(), new Volunteer() };
			
			for(WorkerInterface worker : workers) {
				String name = worker.getName();
				int hours = worker.getHoursWorked();
				Double pay = worker.getPay();
				
				System.out.println("_____________________________________________");
				System.out.println(name +"\t\t\t"+ hours +"\t\t\t" + pay);
				System.out.println("______________________________________________");
				System.out.println("Here a "+sound+" there a "+sound+" everywhere a "+sound+" "+sound);
				System.out.println();
				
				
			}
		TotalHours = hours++
				math
		
}
