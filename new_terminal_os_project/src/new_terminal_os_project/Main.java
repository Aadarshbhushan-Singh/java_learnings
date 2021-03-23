package new_terminal_os_project;
import java.util.Scanner;
import java.io.File;
import java.io.IOException; 
import java.awt.Desktop;
import java.io.*; 

public class Main {
	public static void runCommand() throws IOException, InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(">>>");
		String command=sc.nextLine();
		
		//Help
		if (command.equals("help"))
		{
			System.out.println("This is help.");
			runCommand();
		}
		//clear console
		else if(command.equals("cls"))
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			runCommand();
		}
		//echo
		else if(command.startsWith("echo"))
		{
			System.out.println(command.substring(5));
			runCommand();
		}
		//list-dir
		else if (command.equals("list-dir"))
		{
			File file = new File("C:\\Users\\singh\\Desktop\\java\\new_terminal_os_project\\src\\new_terminal_os_project\\Files_list");

		    // returns an array of all files
		    String[] fileList = file.list();

		    for(String str : fileList) {
		      System.out.println(str);
		    }
		    runCommand();
		}
		//open file
		else if(command.startsWith("open-file ") && command.length()>10)
		{
			
			try {
				String fileName=command.substring(10);
				String path="C:\\Users\\singh\\Desktop\\java\\new_terminal_os_project\\src\\new_terminal_os_project\\Files_list"+"\\"+fileName;
				File file =new File(path);
				
				if (file.exists())
				{
					Process pro=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path);
					pro.waitFor();
					runCommand();
				}
				else
				{
					System.out.println("File doesn't exists.");
					runCommand();
				}
				
			}catch (Exception e)
			{
				System.out.println(e);
				runCommand();
			}
		}
		//open folder
		else if (command.equals("open-folder"))
		{
			try {
				String fileName=command.substring(10);
				String path="C:\\Users\\singh\\Desktop\\java\\new_terminal_os_project\\src\\new_terminal_os_project\\Files_list";
				File file =new File(path);
				
				if (file.exists())
				{
					Process pro=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path);
					pro.waitFor();
					runCommand();
				}
				else
				{
					System.out.println("File doesn't exists.");
					runCommand();
				}
				
			}catch (Exception e)
			{
				System.out.println(e);
				runCommand();
			}
		}
		//exit
		else if(command.equals("exit"))
		{
			System.out.println("Terminal Closed");
			System.exit(0);
			
		}
		//default
		else {
			System.out.println("Wrong Command Input.");
			runCommand();
		}
		sc.close();
	}
	
	public static void main(String[] args)
	{
		try {
			runCommand();	
		}catch (Exception e)
		{
			System.out.println(e);
		}		
	}
}
