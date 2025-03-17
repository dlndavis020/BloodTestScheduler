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

    //Constructor to initialize the queue
    public NoShowQueue() {
        theQueue = new ArrayList<Patients>();
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
        String result = "";
        for(int i = 0; i < theQueue.size(); i++) {
            Patients p = theQueue.get(i);
            if(p != null) {
                result += "Patient: " + p.getName() + " is a no show\n";
            }
        }
        return result;
    }
}


