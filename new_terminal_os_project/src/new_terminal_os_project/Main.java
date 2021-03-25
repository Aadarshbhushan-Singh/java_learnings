package new_terminal_os_project;
import java.util.Scanner;
//import java.awt.Desktop;
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
		else if(command.startsWith("create-file"))
		{
			try {
				String fileName=command.substring(12);
				File myObj=new File(fileName);
				if(myObj.createNewFile())
				{
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
		else if(command.startsWith("write-file" ))
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
		else if(command.startsWith("read-file"))
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
		else if(command.startsWith("file-info")) 
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
		else if(command.startsWith("delete-file"))
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
