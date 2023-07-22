package javaPrograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTimeExample {
 public static void main(String[] args) {
	DateTimeFormatter dtf= DateTimeFormatter.ofPattern
			                   ("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now= LocalDateTime.now();
	System.out.println("Currentdate and time:"+dtf.format(now));
 }
 
}
