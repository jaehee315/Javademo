package java006_class.part08;
/*
 * 사원중에 부서가 결정되지 않은 경우 부서는 "보류", 급여는 3000으로
 * 기본값으로 설정한다.
 */

public class Employees {
	String name;
	int dept;
	int salary;
	
	public Employees() {
		
	}
	public Employees(String name) {
		this("보류", 3000);
		this.name = name;
	}
	
	public Employees(String dapt, int salary) {
		this.dept = dept;
		this.salary = salary;
	}
			
	 public Employees(String name, String dapt, int salary) {
		 this.name = name;
		 this.dept = dept;
		 this.salary = salary;
		
	}

}
