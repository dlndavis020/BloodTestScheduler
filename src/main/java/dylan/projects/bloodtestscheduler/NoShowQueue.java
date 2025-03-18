/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dylan.projects.bloodtestscheduler;

/**
 * @author Dylan White X21130515
 * BloodTestScheduler
 * This class will implement a queue for the no show list
 */
import java.util.*;
public class NoShowQueue implements QueueInterface {
    //ArrayList to store the queue elements
    private ArrayList <Patients> theQueue;
    //This sets a maximum size for the queue
    private static final int max = 5;
    //Declaring String called result
    String result;

    //Constructor to initialize the queue
    public NoShowQueue() {
        theQueue = new ArrayList<Patients>();
        result = "";
    }

    //Method to check is the queue empty
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    //Method to check the size of the queue
    public int size() {
        return theQueue.size();
    }

    //Method to enqueue an element
    public void enqueue(Object element) {
        theQueue.add((Patients)element);
    }

    //Method to dequeue an element if there are more than 5 elements
    public Object dequeue() {
        if(theQueue.size() > max) {
            return theQueue.remove(0);
        }else
            return null;
    }

    //Method to print all elements in the queue
    public String printQueue() {
        return recursion(0, "");
        //Below is my original code for printing the queue before I decided this would be where I would use recursion
/*        for(int i = 0; i < theQueue.size(); i++) {
          Patients p = theQueue.get(i);
           if(p != null) {
              result += "Patient: " + p.getName() + " is a no show\n";
           }
        }
        return result;
 */
    }

    //This is the method create the 
    private String recursion(int index, String result) {
        //This will stop recursion if the index is the same size or greater than theQueue
        if(index >= theQueue.size()) {
            return result;
        }
        //This gets the current patient in the queue
        Patients p = theQueue.get(index);
        if(p != null) {
            //Adds the patients name to the result String
            result += "Patient" + p.getName() + " is a no show\n";
        }
        //This will call the method again with the next index and result
        return recursion(index + 1, result);
    }
}


