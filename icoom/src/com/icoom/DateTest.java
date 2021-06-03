package com.icoom;
import java.util.Date;
import java.text.*;
import java.time.*;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat fs = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前日期是：" + fs.format(date));
		System.out.println(LocalDate.now());
		System.out.println(Instant.now());
		System.out.println(Instant.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(date);
	}
}
