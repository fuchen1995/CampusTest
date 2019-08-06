package com.vivo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		
		String b = in.nextLine();
		
		System.out.println(a.matches(b));

	}

	public int calculation(String d1, String d2) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date date1 = sdf.parse(d1);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		long time1 = cal.getTimeInMillis();
		Date date2 = sdf.parse(d2);
		cal.setTime(date2);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}
}
