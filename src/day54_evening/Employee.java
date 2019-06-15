package day54_evening;

public class Employee extends Person {
	  private int employee_id;
	  private int salary;
	  // this a constant for max salary
	  // we shouldn't have employees who has higher salary than MAX_SALARY
	  final private int MAX_SALARY = 150000;

	  public Employee(String name, int age, char gender, int employee_id, int salary) {
	    super(name, age, gender);
	    this.employee_id = employee_id;
	    setSalary(salary);

	  }

	  public int getEmployee_id() {
	    return employee_id;
	  }

	  public void setEmployee_id(int employee_id) {
	    this.employee_id = employee_id;
	  }

	  public int getSalary() {
	    return salary;
	  }

	  public void setSalary(int salary) {
	    if (salary <= MAX_SALARY) {
	      this.salary = salary;
	    } else {
	      System.out.println("Cannot set salary. Value is too high");
	      System.out.println("You don't wanna make more than CEO");
	      System.out.println("I am serious.");
	    }
	  }

	  public String toString() {
	    return "Employee [name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() + ", employee_id="
	        + employee_id + ", salary=" + salary + "]";
	  }

	}
