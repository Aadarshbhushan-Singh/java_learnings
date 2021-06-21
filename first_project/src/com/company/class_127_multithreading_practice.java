
package com.company;
import java.io.*;

public class class_127_multithreading_practice {
    public static void main(String[] args) throws Exception
    {
        Thread t1=new Thread(new Runnable(){
            public void run(){
                for(int i=1; i<=10; i++)
                {
                    System.out.println(i);
                    
                    
                    try{
                        Thread.sleep(20000);
                    }catch(Exception e)
                    {
                        
                    }
                }
            }
        });
        
        
        
        Thread t2=new Thread(new Runnable(){
           public void run(){
               for(int i=11; i<=20; i++)
               {
                   System.out.println(i);
               }
           }
        });
        
        t1.start();
        t1.join();
        t2.start();
        
        
        
            
        
    }
}
