package com.company;
import java.net.InetAddress;

public class class_102_show_ip_mac_adress {
	public static void main(String args[])
	{
		try {
			InetAddress IP = InetAddress.getLocalHost();
	        System.out.println("IP of my system is := "+IP.getHostAddress());
		}catch(Exception e)
		{
			System.out.println("An error occured.");
		}
//		 String locale = context.getResources().getConfiguration().locale.getCountry(); 
//		 System.out.println(locale);
		
	}
}
