package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

    private int id;
    private String firstName;
    private int age;
    private double salary;

    Employee(int id, String firstName, int age, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        //test createEmployees
    	String[] employeesStr = new String[]{"30,John,24,7500", "5,Hail,36,7899.90", "3,hill,60,10699.90", "15,may,52,9900.30"};
        Employee[] employees = createEmployees(employeesStr);
        //test salaryGreaterThanFiveThousand
        double sum = Employee.salaryGreaterThanFiveThousand(employees);
        System.out.println(sum);
        //test fizzBuzz
        for (int i = 0; i < employees.length; i++) {
        	Employee.fizzBuzz(employees[i]);
        }
        //test swap salary
        Employee.swap(employees[0], employees[1]);
        //test scoialsecurityTax
        System.out.println(Employee.socialSecurityTax(employees[2]));
        //test insuranceCoverage
        System.out.println(Employee.insuranceCoverage(employees[1]));
        //test sortSalary
        Employee.sortSalary(employees[1], employees[2],employees[3]);
        
    }
    
    
	/*
	This method should return the sum of salaries of employees having salary greater than 5000
	Note: Employee array is passed, not employee
	*/

    public static double salaryGreaterThanFiveThousand(Employee[] employees) {
        
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > 5000) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }


	/*
	This method should print either "Fizz", "Buzz" or "FizzBuzz"
	"Fizz" - if id of employee is divisible by 3
	"Buzz" - if id of employee is divisible by 5
	"FizzBuzz" - if id of employee is divisible by both 3 and 5
	*/

    public static void fizzBuzz(Employee employee) {
           	
    		if (employee.getId() % 3 == 0 && employee.getId() % 5 != 0) {
                System.out.println("Fizz");
            } else if (employee.getId() % 5 == 0 && employee.getId() % 3 != 0) {
            	System.out.println("Buzz");
            } else if (employee.getId() % 5 == 0 && employee.getId() % 3 == 0) {
                System.out.println("FizzBuzz");
                }
    		
    }

	/*
	We are given two employee objects.
	Implement this method to swap salaries of employees
	*/

    public static void swap(Employee firstEmployee, Employee secondEmployee) {
  
    	double tempSalary;
        tempSalary = firstEmployee.getSalary();
        firstEmployee.setSalary(secondEmployee.getSalary());
        secondEmployee.setSalary(tempSalary);
        System.out.println(firstEmployee.getSalary() + " , " + secondEmployee.getSalary());
      
    }


	/*
	Write a method to calculate the Social Security Tax of an employee and print it.
	If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
	If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
	*/

    public static double socialSecurityTax(Employee employee) {
    
    	double ssTax;
        if (employee.getSalary() < 8900) {
            ssTax = employee.getSalary() * 0.062;
        }

        else {
        	ssTax = 106800 * 0.062;
        }
        return ssTax;
    }


	/*
	Write a method to calculate an employee's contribution for insurance coverage and print it.
	Amount of deduction is computed as follows:
	If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
	If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
	*/

    public static double insuranceCoverage(Employee employee) {
        
    	double employeeInsurance = 0.0;
        if (0 < employee.getAge() && employee.getAge() <= 35) {
            employeeInsurance = employee.getSalary() * 0.03;
        } else if (35 < employee.getAge() && employee.getAge() <= 50) {
            employeeInsurance = employee.getSalary() * 0.04;
        } else if (50 < employee.getAge() && employee.getAge() < 60) {
            employeeInsurance = employee.getSalary() * 0.05;
        } else if (60 <= employee.getAge()) {
            employeeInsurance = employee.getSalary() * 0.06;
        } else {
            System.out.println("Error");
        }

        return employeeInsurance;
    }


	/*
	Write a method to sort three employees' salary from low to high, and then print their name in order.
	For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
	John Alice Jenny
	*/

    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
    	List<Employee> list = new ArrayList<Employee>();
    	list.add(e1);
    	list.add(e2);
    	list.add(e3);
    	Collections.sort(list, new Comparator<Employee>() {
        	@Override
		    public int compare(Employee o1, Employee o2) {
        		 return (o1.getSalary() > o2.getSalary()) ? 1 : -1;
        	 }
		 });
    	
		for (int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getFirstName() + "'s salary is "+ list.get(i).getSalary());
		}
    }


    //***************** Additional question for Extra Credit *****************/
	/*
	Implement this method to convert String[] to employees array.
	Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
	This String array of length 2 contains 2 employees in form of string, where
	id = 1
	firstName=John
	age=24
	salary=7500
	convert each string to employee object.
	Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	*/

    public static Employee[] createEmployees(String[] employeesStr) {
        Employee[] employees = new Employee[employeesStr.length];
        
        for (int i = 0; i < employeesStr.length; i++) {
            String employeeStr = employeesStr[i];
            String[] tmp = employeeStr.split(",");
            Employee employee = new Employee(Integer.valueOf(tmp[0]), tmp[1], Integer.valueOf(tmp[2]), Double.valueOf(tmp[3]));
            employees[i] = employee;
        }
        return employees;
    }
}


