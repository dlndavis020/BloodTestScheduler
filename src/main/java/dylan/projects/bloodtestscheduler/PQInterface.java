/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dylan.projects.bloodtestscheduler;

/**
 * @author Dylan White X21130515
 * BloodTestScheduler
 * This will define which methods will be used for the Priority Queue
 */
public interface PQInterface {
    public void enqueue(int key, Object element);//Will enqueue an element with a given key
    public int size();//Will get the size of the Priority Queue
    public boolean isEmpty();//Will check if the Priority Queue is empty
    public Object dequeue();//Will dequeue the highest priority element
    public String printPQueue();//Will print out all methods of the Priority Queue
}
