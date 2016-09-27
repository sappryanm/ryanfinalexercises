package com.techelevator;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class EmployeeTest {
	private Employee employeeRyan;
	@Before
	public void setUp(){
		employeeRyan = new Employee(120,"Ryan", "Sapp", 102000);
	}

	
	
	@Test
	public void intialize_values_are_stores_correctly() {
		
		
		String firstName = employeeRyan.FullName();
		String LastName = employeeRyan.LastName();
		String FullName = employeeRyan.FullName();
		//Assert.assertEquals("Ryan", firstName);
		//Assert.assertEquals("Sapp", LastName);
		//Assert.assertEquals("Ryan Sapp", FullName);
		String department= employeeRyan.getDepartment();
		 employeeRyan.setDepartment("Science");
	}
	@Test
	public void test_raise_salary() {
		
		employeeRyan.RaiseSalary(102.00);
		int beforeRaise = (int)employeeRyan.getAnnualSalary();
		//double testRaiseAmount = beforeRaise + employeeRyan.RaiseSalary(102.00);
	}

	/*@Test
	public void reserve_a_first_class_seat() {
		//int firstClassSeats = ourPlane.getAvailableFirstClassSeats();
		boolean success = employeeRyan.reserve(true, 1);
		int firstClassAvailable = employeeRyan.getAvailableFirstClassSeats();
		
		Assert.assertTrue("We were able to reserve a First CLass Seat", success);
		Assert.assertEquals(12, firstClassAvailable);
		
	}


   */
	@Test
    public void getters_setters_test(){
    /*** Test should pass if a person object has been initialized. ***/
    Employee employeeTest = new Employee(120,"Ryan", "Sapp", 102000);
    //if(planeTest.getPlaneNumber() == null) {
       // allTestsPassed = false;
    int successEmployeeID = employeeTest.getEmployeeId();
    Assert.assertEquals(120, successEmployeeID);
    String successFirstName = employeeTest.FirstName();
    Assert.assertEquals("Ryan", successFirstName);
    String successLastName = employeeTest.LastName();
    Assert.assertEquals("Sapp", successLastName);
    
//    String successFullName = employeeTest.FullName();
//    Assert.assertEquals("Ryan Sapp", successFullName);
//   String successDepartment = employeeTest.setDepartment();
//    Assert.assertEquals("Softwre", successDepartment);
    int successSalary = (int)employeeTest.getAnnualSalary();
    Assert.assertEquals(102000, successSalary);
        
    }
	
	/*	   public static void main(String[] args) {
		      
		      System.out.println(result.wasSuccessful());
		   }*/

	public static void main(String[] args){ 
		
		Employee Ryan = new Employee(102,"Ryan", "Sapp",50000); 
		 Ryan.setDepartment("Science");
		// Ryan.setDepartment(department)
		System.out.println("Name: " + Ryan.FirstName() + " Salary: " + Ryan.getAnnualSalary()); 

		
		Ryan.RaiseSalary(10); 
		System.out.println(Ryan.FirstName() + "'s Salary is now: " + Ryan.getAnnualSalary()); 
		} 
}


