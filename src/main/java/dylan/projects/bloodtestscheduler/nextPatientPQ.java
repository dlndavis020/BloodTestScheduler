/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dylan.projects.bloodtestscheduler;

import java.util.*;

/**
 * @author Dylan White X21130515
 * BloodTestScheduler
 * This class handles the Priority Queue(PQ) for Patients based on Priority
 */
public class nextPatientPQ implements PQInterface{
    //ArrayList to store the elements of the Priority Queue
    private ArrayList <PQElement> pq;

    //Constructor to initialize the priority queue
    public nextPatientPQ() {
        pq = new ArrayList<PQElement>();
    }
    
    //This method will check if the PQ is empty
    public boolean isEmpty() {
        return pq.isEmpty();
    }
    
    //This Method will get the size of the PQ
    public int size() {
        return pq.size();
    }

    //This method will enqueue a bew element with a given key and item
    public void enqueue(int priorkey, Object item) {
        //This will create a new PQElement with a priority and patient
        PQElement elem = new PQElement(priorkey,(Patients)item);

        //Add the new element to the end of the list
        pq.add(elem);

        //Insertion Sort Algorithm
        for(int i = 1; i < pq.size(); i++) {
            PQElement current = pq.get(i);//This is the current element to insert
            int j = i - 1;//This will compare with the previous element

            //This will move elements to the right to make space for the current element
            while (j >= 0 && pq.get(j).getKey() < current.getKey()) {
                pq.set(j + 1, pq.get(j));
                j--;
            }
            //this puts the current element in the correct position
            pq.set(j + 1, current);
        }
    }

    //Method to dequeue the element with the highest Priority
    public Object dequeue() {
        return pq.remove(0);
    }

    //This method will print all elements currently in the PQ
    @Override
    public String printPQueue() {
        String printStr = new String();
        PQElement elem;
        for(int i = 0; i < pq.size(); i++) {
            elem = pq.get(i);
            printStr = printStr.concat(elem.printPatient() + " | " + "Priority: " + elem.getKey() + "\n");
        }
        return printStr;
    }
}