/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaThreads;


/**
 *
 * @author isaacfuentes
 */

//Creating a Thread by extending the Thread class.
public class javaThreads extends Thread  {
    public static void main(String[] args) 
    { 
        // making a reference to Main thread 
        System.out.println("Making reference to main thread by executing\n"
                + "Thread mainThread = Thread.currentThread();");
        Thread mainThread = Thread.currentThread(); 
        
        System.out.println();
        // retrieving name of Main thread
        System.out.println("Retrieving the name of the main Thread by using the getName method");
        System.out.println("Current thread: " + mainThread.getName()); 
        
        System.out.println();
        // changing the name of Main thread 
        System.out.println("Renaming the main thread with setName method");
        mainThread.setName("CIT360"); 
        System.out.println("After name change: " + mainThread.getName()); 
          
        System.out.println();
        // getting priority of Main thread 
        System.out.println("Printing the default priority which is 5 using getPriority method");
        System.out.println("Main thread priority: "+ mainThread.getPriority()); 
          
        System.out.println();
        // changing the priority of Main thread to 10 
        System.out.println("Changint thread priority to 10 using setPriority method");
        mainThread.setPriority(MAX_PRIORITY); 
        System.out.println("Main thread new priority: "+ mainThread.getPriority()); 
          
        System.out.println();
        //looping through the thread considering less than 10 threads to be display.
        System.out.println("Looping through the main thread no more than 5 threads");
        for (int i = 0; i < 10; i++) 
        { 
            System.out.println("Main thread"); 
        } 
        
        
        System.out.println();
        System.out.println("Create a child thread out of the main thread, which will\n"
                + "inherit the properties of the parent thread like the priority.");
        // Main thread creating a child thread 
        ChildThread ct = new ChildThread(); 
          
        System.out.println();
        // getting priority of child thread 
        // which will be inherited from Main thread 
        // as it is created by Main thread 
        System.out.println("get the current prioruty of the thread.");
        System.out.println("Child thread priority: "+ ct.getPriority()); 
          
        
        System.out.println();
        // setting priority of Main thread to MIN(1) 
        System.out.println("gChanging the priority to 1");
        ct.setPriority(MIN_PRIORITY); 
        System.out.println("Child thread new priority: "+ ct.getPriority()); 
        
        System.out.println();
        // starting child thread 
        System.out.println("Starting the child thread and using a loop to itinirate\n"
                + "until it reaches 5 executions.");
        ct.start(); 
    } 
} 
  
// Child Thread class 
class ChildThread extends Thread 
{ 
    @Override
    public void run()  
    { 
        for (int i = 0; i < 5; i++) 
        { 
            System.out.println("Child thread cit360"); 
        } 
    } 
}
