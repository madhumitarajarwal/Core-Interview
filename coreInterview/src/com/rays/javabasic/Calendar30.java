package com.rays.javabasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar30 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		for (int i = 1; i <= 30; i++) {
			System.out.println(sdf.format(c.getTime()));
			c.add(Calendar.DATE, 1);

		}

	}
}
