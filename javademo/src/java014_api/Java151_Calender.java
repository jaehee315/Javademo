package java014_api;
import java.util.Calendar;

/*
 * 수능일 : 2022-11-17
 * 오늘 : 2022-12-1
 * 남은일 : 15
 */

public class Java151_Calender {

	public static void main(String[] args) {
		
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2022;
		int examDay_month = 12;
		int examDay_data = 17;
		
	 examDay.set(examDay_year, examDay_month-1, examDay_data); 
	 System.out.println(examDay); 
	 
	 Calendar toDay = Calendar.getInstance();
	 toDay.set(Calendar.HOUR, 0);
	 toDay.set(Calendar.MINUTE, 0);
	 toDay.set(Calendar.SECOND, 0);
	 
	 System.out.println(toDay);
	 
	 long eventDay = examDay.getTimeInMillis();
	 long nowDay = toDay.getTimeInMillis();
	 System.out.println("eventDay:" + eventDay);
	 System.out.println("nowDay:" + nowDay);
	 
	 //하루계산
	 System.out.println(60*60*24*1000);
	 System.out.println(eventDay-nowDay);
	 
	 long endDay = (eventDay-nowDay)/(60*60*24*1000);
	 System.out.println("남은 일:" + endDay);
	 
	 
	}//end

}
