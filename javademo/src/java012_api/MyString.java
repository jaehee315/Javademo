package java012_api;

import java.util.Arrays;

public class MyString {
	private char[] arr;
	public MyString() {
		// TODO Auto-generated constructor stub
	}
	public MyString(char[] arr) {
		this.arr = arr;
	}
	
	public int length() {
		return arr.length;
	}
	
	public boolean isUpperCase(int index) {
		if(arr[index]>='A' && arr[index]<= 'Z') {
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isLowerCase(int index) {
		if(arr[index] >= 'a' && arr[index] <= 'z') {
			return true;
		}else {
			return false;
		}
	}
	
	public char charAt(int index) {
		return arr[index];
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}


}
