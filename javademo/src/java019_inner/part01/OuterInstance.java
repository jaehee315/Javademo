package java019_inner.part01;

import java.util.concurrent.Flow.Publisher;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;
import com.sun.tools.sjavac.pubapi.PubApi;

public class OuterInstance {

	 private int num;
	 private int data;
	 
	 
	 public void display() {
		 System.out.println("display");

	 }
	 
	 class InnerInstance{
		 int local = 4;
		 public void run() {
			 num = 10;
			 System.out.println(num);
		 }
	 }
}

