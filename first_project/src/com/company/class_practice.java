package com.company;
import java.util.Scanner;
abstract class Mobile1
{
	public void calling()
	{
		System.out.println("Your mobile is calling...");
	}
	public void message()
	{
		System.out.println("Your mobile is sending texts...");
	}
	public abstract void playMusic();
	public abstract void sendVideo();
	
	
}

abstract class Mobile2 extends Mobile1
{
	public void playMusic()
	{
		System.out.println("Mobile is playing music...");
	}
	public void sendVideo()
	{
		System.out.println("Your moobile is sinding video...");
	}
}

class Mobile3 extends Mobile2
{
	public void camera()
	{
		System.out.println("Mobile is clicking photo...");
	}
	public void radio()
	{
		System.out.println("Mobile is working as radio...");
	}
}


public class class_practice {
	public static void main(String[] args) {
			Mobile3 obj1=new Mobile3();
			obj1.calling();
			obj1.playMusic();
			obj1.sendVideo();
			obj1.message();
	}
}


