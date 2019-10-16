package com.ust.usttyspringcore;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

	public static void main(String[] args) throws ParseException {
		String date = "15/08/47";
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yy");
		Date d = format.parse(date);
		System.out.println(d.toString());
	}
}
