package com.educacionIT.digitalers.Clase04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App2 {

	public static void main(String[] args) throws ParseException {
		Date fecha;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		fecha = sdf.parse("1995-10-18");
		System.out.println(fecha);
	}

}
