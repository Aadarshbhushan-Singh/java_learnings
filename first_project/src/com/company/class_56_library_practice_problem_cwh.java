package com.company;
import java.util.Scanner;
// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, printAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books

class library{
    public String[] availableBooks =new String[100];
    public String[] issuedBooks =new String[100];
    static int n=0; //Count for available books
    static int m=0; //Count for Issued books

    //Function to add some books in the beginning of the program
    //If books is already present it will not add.
    public void addBooks(String book){
        boolean add=true;
        for(int i=0; i<n; i++){
            if(availableBooks[i].equals(book)){
                add=false;
                break;
            }
        }
        if(add){
            availableBooks[n]=book;
            n+=1;
            System.out.println(book+" has been added successfully.");
        }else{
            System.out.println(book+" book is already added.");
        }

    }

    //Issue books deletes the books from availableBooks and adds in issueBooks array
    public void issueBooks(String book){
        boolean found=false;
        int index=0;
        for(int i=0; i<n; i++){
            if(availableBooks[i].equals(book)){
                found=true;
                index=i;
                break;
            }
        }
        if(found){
            issuedBooks[m]=book;
            m+=1;
            String temp=availableBooks[index];
            availableBooks[index]=availableBooks[n-1];
            availableBooks[n-1]=null;
            n-=1;
            System.out.println(book+" book has been issued.");
        }else{
            System.out.println("Sorry "+book+" book is not available right now.");
        }
    }

    //Return books adds book to the availableBooks and deletes from issuedBooks;
    public void returnBook(String book){
        boolean found=false;
        int index=0;
        for(int i=0; i<m; i++){
            if(issuedBooks[i].equals(book)){
                index=i;
                found=true;
            }
        }
        if(found){
            availableBooks[n]=book;
            n+=1;
            issuedBooks[index]=null;
            m-=1;
            System.out.println(book+" has been returned successfully.");
        }else{
            System.out.println(book+" book has not been issued yet.");
        }
    }

    //Print available books
    public void printAvailableBooks(){
        if(n>0){
            System.out.println("\nList of available books in library is: ");
            for(int i=0; i<n; i++){
                System.out.println(availableBooks[i]);
            }
        }else{
            System.out.println("\nNo Books found in store.");
        }


    }
}
public class class_56_library_practice_problem_cwh{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        library obj1=new library();

        //Adding 3 books in beginning
        obj1.addBooks("Science");
        obj1.addBooks("Maths");
        obj1.addBooks("Nepali");
        obj1.addBooks("Hindi");
        obj1.addBooks("Newari");

        //Driver code starts from here...
        System.out.println("Welcome to Nepal Library...🙂🙂🙂");
        boolean goOn=true;
        while(goOn){
            System.out.println("Please enter: ");
            System.out.println("1 to Add books \n2 to  issue books \n3 to return books \n4 to see available books \n5 to exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Please enter the book to add: ");
                    String book1=sc.next();
                    obj1.addBooks(book1);
                    break;
                case 2:
                    System.out.println("Please enter the book to be issued: ");
                    String book2=sc.next();
                    obj1.issueBooks(book2);
                    break;
                case 3:
                    System.out.println("Please enter the book to return: ");
                    String book3=sc.next();
                    obj1.returnBook(book3);
                    break;
                case 4:
                    obj1.printAvailableBooks();
                    break;
                case 5:
                    goOn=false;
                    System.out.println("Successfully exited the program.");
                    break;
                default:
                    System.out.println("Sorry the input is wrong...");
            }
        }
    }
}