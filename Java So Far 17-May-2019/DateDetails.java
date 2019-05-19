import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
class DateDetails{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Date in dd-MM-yyyy format");
		String startDate =sc.next();
		Date d2 = new Date();

		SimpleDateFormat format =new SimpleDateFormat("dd-MM-yyyy");
		String endDate = format.format(d2);
		
		
		try{
		Date start = format.parse(startDate);
		Date end = format.parse(endDate);
		System.out.println(end);
		long diff = end.getTime()-start.getTime();
		long days = (int)(diff/(1000*60*60*24));
		int month = (int)(diff / (24*60*60*1000*12));
		int year = (int)(diff / (24*60*60*1000*12*30.41));
		System.out.println("Duration in days is:" +days);
		
		System.out.println("month"+" "+month);
		System.out.println("Duration in years:" +year);
	}
		 catch(ParseException pe){
			System.out.println("Parse Exception occurs");
		}
		
		

	}}
