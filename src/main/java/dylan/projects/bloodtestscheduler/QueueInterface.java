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
public interface QueueInterface {
    public boolean isEmpty();
    public int size();
    public void enqueue(Object element);
    public Object dequeue();
    public Object printQueue();
}
