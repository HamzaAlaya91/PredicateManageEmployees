package packageTest;

import java.util.ArrayList;
import java.util.Arrays;
import static packageTest.EmployeePredicates.*;

public class TestEmployeePredicates {

	public static void main(String[] args) {

		Employee e1 = new Employee(1,30,"M","Hamza","Alaya");
		Employee e2 = new Employee(2,27,"F","Syrine","Hssan");
		Employee e3 = new Employee(1,15,"M","AA","AAAA");
		Employee e4 = new Employee(1,35,"F","BB","BBBB");
		Employee e5 = new Employee(1,40,"M","CC","CCCC");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.addAll(Arrays.asList(e1,e2,e3,e4,e5));
		
		
		System.out.println( filterEmployees(employees, isAdulteMale()) );	
		
		System.out.println( filterEmployees(employees, isAdulteFemale()) );		

		System.out.println( filterEmployees(employees, isAgeMoreThan(35)) );		

		
		//Employees other than above collection of "isAgeMoreThan(35)" 
        //can be get using negate()
		System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
		
		
	}

}
