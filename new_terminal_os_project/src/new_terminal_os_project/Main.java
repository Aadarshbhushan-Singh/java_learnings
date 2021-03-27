package new_terminal_os_project;

import java.util.Scanner;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.nio.file.Files; 
import java.net.*;

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
		else if(command.startsWith("echo "))
		{
			System.out.println(command.substring(5));
			runCommand();
		}
		//list directory 
		else if (command.equals("list-dir"))
		{
			try {
				File file = new File("C:\\Users\\singh\\Desktop\\java\\new_terminal_os_project\\src\\new_terminal_os_project\\Files_list");
	
			    // returns an array of all files
			    String[] fileList = file.list();
	
			    for(String str : fileList) {
			      System.out.println(str);
			    }
			    runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
			}
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
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//open folder
		else if (command.equals("open-folder"))
		{
			try {
				
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
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//create-file
		else if(command.startsWith("create-file "))
		{
			try {
				String fileName=command.substring(12);
				File myObj=new File(fileName);
				if(myObj.createNewFile())
				{
					System.out.println(fileName+" created successfylly.");
					runCommand();
				}
				else
				{
					System.out.println("File already exists.");
					runCommand();
				}
			}catch (Exception e)
			{
				System.out.println("An error occured.");
			}
		}
		//write-file If file is not present then it creates the file.
		else if(command.startsWith("write-file " ))
		{
			
			try {
				String fileName=command.substring(11);
				FileWriter myWriter=new FileWriter(fileName);
				String content=sc.nextLine();
				myWriter.write(content);
				myWriter.close();
				System.out.println("Successfully wrote to the file.");
				runCommand();
			}catch (Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//read-file
		else if(command.startsWith("read-file "))
		{
			try {
				String fileName=command.substring(10);
				File myObj=new File(fileName);
				if(myObj.exists())
				{
					Scanner myReader=new Scanner(myObj);
					while(myReader.hasNextLine())
					{
						String data=myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();
					runCommand();
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
				
			}catch(Exception e)
			{
				System.out.println("No such file exists.");
				runCommand();
			}
		}
		//File-info	
		else if(command.startsWith("file-info ")) 
		{
			try {
				String fileName=command.substring(10);
				File myObj=new File(fileName);
				if(myObj.exists()) {
					System.out.println("File name: "+myObj.getName());
					System.out.println("Absolute path: "+myObj.getAbsolutePath());
					System.out.println("Writable: "+myObj.canWrite());
					System.out.println("Readable: "+myObj.canRead());
					System.out.println("File size in bytes: "+myObj.length());
					runCommand();
				}else
				{
					System.out.println("No such file exists.");
					runCommand();
				}
				
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//delete file
		else if(command.startsWith("delete-file "))
		{
			
			try{
				String fileName=command.substring(12);
				File myObj=new File(fileName);
				if(myObj.delete())
				{
					System.out.println("File deleted successfully.");
					runCommand();
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
			
		}
		//copy-file
		else if(command.startsWith("copy-file "))
		{
			try {
				String fileName=command.substring(10);
				File originalFile=new File(fileName);
				if(originalFile.exists()) {
					File copiedFile=new File("Copied_"+fileName);
					Files.copy(originalFile.toPath(), copiedFile.toPath());
					System.out.println("File copied successfully.");
					runCommand();
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
			}catch(Exception e)
			{
				System.out.println("An error occured.");
			}
		}
		//rename-file
		else if(command.startsWith("rename-file "))
		{
			try{
				String fileName=command.substring(12);
				File originalFile=new File(fileName);
				if(originalFile.exists())
				{
					System.out.println("Enter new name: ");
					String newName=sc.nextLine();
					File renamedFile=new File(newName);
					if(originalFile.renameTo(renamedFile))
					{
						System.out.println(originalFile.getName()+" renamed to "+renamedFile.getName());
						runCommand();
					}else {
						System.out.println("Such file already exists.");
						runCommand();
					}
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
				
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}			
		}
		//File-size
		else if(command.startsWith("file-size "))
		{
			try {
				String fileName=command.substring(10);
				File myObj=new File(fileName);
				if(myObj.exists()) {
					System.out.println(myObj.length()+" bytes");
					runCommand();
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
			}catch(Exception e) {
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//file-help
		else if(command.equals("file-help"))
		{
			try {
				System.out.println("This is file-help.");
				runCommand();
			}catch(Exception e) 
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//date
		else if(command.equals("date"))
		{
			try {
				System.out.println(java.time.LocalDate.now());
				runCommand();
			}catch(Exception e)
			{
				System.out.println();
				runCommand();
			}
		}
		//time
		else if(command.equals("time"))
		{
			try {
				System.out.println(java.time.LocalTime.now());
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//date-time
		else if(command.equals("date-time") || command.equals("date-time ")) {
			try {
				System.out.print(java.time.LocalDate.now());
				System.out.println(" "+java.time.LocalTime.now());
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//ip-address
		else if(command.equals("show-ip") || command.equals("show-ip ")) {
			try{
				InetAddress IP = InetAddress.getLocalHost();
				System.out.println("IP of my system is := "+IP.getHostAddress());
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
	        
		}
		//mac-address
		else if(command.equals("show-mac") || command.equals("show-mac "))
		{
			InetAddress ip;
			try {
				ip = InetAddress.getLocalHost();
				NetworkInterface network = NetworkInterface.getByInetAddress(ip);
				byte[] mac = network.getHardwareAddress();
	            
		        System.out.print("MAC adress of my system is : ");
		            
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < mac.length; i++) {
		            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
		        }
		        System.out.println(sb.toString());
		        runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//whoami
		else if(command.equals("whoami"))
		{
			try {
				String username = System.getProperty("user.name");
			    System.out.println(username);
			    runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//get-current-location
		else if(command.equals("display-location"))
		{
			try {
				System.out.println("Nepal");
				System.out.println("Province-01");
				System.out.println("Sunsari");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//shutdown
		else if(command.equals("shutdown"))
		{
			try {
				Runtime r=Runtime.getRuntime();
				System.out.println("System is going to shutdown.");
				r.exec("shutdown -s");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//reboot
		else if(command.equals("reboot"))
		{
			try {
				Runtime r=Runtime.getRuntime();
				System.out.println("System is going to restart.");
				r.exec("shutdown -r");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//hybernate
		else if(command.equals("hybernate")) {
			try {
				Runtime r=Runtime.getRuntime();
				System.out.println("System is going to hybernate.");
				r.exec("shutdown -h");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//shutdown-interval
		else if(command.startsWith("shutdown -")) {
			try {
				String time=command.substring(10);
				int intTime=Integer.parseInt(time);
				Runtime r=Runtime.getRuntime();
				System.out.println("System will shutdown in "+time+" secs.");
				r.exec("shutdown -s -t "+intTime);
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}			
		}
		//restart-interval
		else if(command.startsWith("restart -"))
		{
			try {
				String time=command.substring(9);
				int intTime=Integer.parseInt(time);
				Runtime r=Runtime.getRuntime();
				System.out.println("System will restart in "+time+" secs.");
				r.exec("shutdown -r -t "+intTime);
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//hybernate-interval
		else if(command.startsWith("hybernate -")) {
			try {
				String time=command.substring(11);
				int intTime=Integer.parseInt(time);
				Runtime r=Runtime.getRuntime();
				System.out.println("System will hybernate in "+intTime+" secs.");
				r.exec("shutdown -h -t "+intTime);
				
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//sleep
		else if(command.equals("sleep"))
		{
			try {
				Runtime.getRuntime().exec("Rundll32.exe powrprof.dll,SetSuspendState Sleep");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//abort timer restart or shutdown
		else if(command.equals("abort-shutdown") || command.equals("abort-restart") || command.equals("abort-hybernate"))
		{
			try {
				Runtime r=Runtime.getRuntime();
				r.exec("shutdown -a");
				System.out.println("Command Aborted.");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
			
		}
		//computer info
		else if(command.equals("computer-info"))
		{
			try {
				System.out.println("Name of OS: "+ System.getProperty("os.name"));
				System.out.println("Version of OS: "+System.getProperty("os.version"));
				System.out.println("Architecture of OS: "+System.getProperty("os.arch"));
				System.out.println("User Name: "+System.getProperty("user.name"));
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//show disk
		else if(command.equals("show-disk"))
		{
			try {
				FileSystemView fsv = FileSystemView.getFileSystemView();
		         
		        File[] drives = File.listRoots();
		        if (drives != null && drives.length > 0) {
		            for (File aDrive : drives) {
		                System.out.println("Drive Letter: " + aDrive);
		                System.out.println("\tType: " + fsv.getSystemTypeDescription(aDrive));
		                System.out.println("\tTotal space: " + aDrive.getTotalSpace());
		                System.out.println("\tFree space: " + aDrive.getFreeSpace());
		                System.out.println();
		            }
		        }
		        runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//info
		else if(command.equals("software-info"))
		{
			try {
				System.out.println("This terminal was made as OS Project made by: ");
				System.out.println("Deepak Raj Gupta");
				System.out.println("Aditya Yadav");
				System.out.println("Aadarshbhushan Singh");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
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
			System.out.println("An error occured.");
		}		
	}
}