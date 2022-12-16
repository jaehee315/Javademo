package java008_static_access.prob.part01;

// -(private)    + (public)    #(protected)     X : default
/* 
 * -name:String                    
 * -dept:String 
 * -pay:int
 * -score:double
 * 
 * +setName(name:String):void
 * +setDept(dept:String):void
 * +setPay(pay:int):void
 * +setScore(score:double):void
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 * +setEmployee(name:String, dept:String, pay:int, score:double):void
 * +toString():String 
 */
public class Employee {
	
	private String name;
	private String Dept;
	private int pay;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String setDept() {
		return this.name;
	}
	
	
	public void setDept(String Dept) {
		this.Dept = Dept;
	}
	
	public String getName() {
		return this.Dept;
	}
	
	
	public void setpay(int pay) {
		this.pay = pay;
	}
	
	public int getpay() {
		return this.pay;
	}
}
















