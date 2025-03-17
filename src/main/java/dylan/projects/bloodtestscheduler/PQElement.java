/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dylan.projects.bloodtestscheduler;

/**
 * @author Dylan White X21130515
 * BloodTestScheduler
 * This class represents an element within the Priority Queue.
 * It has a key and an element
 */
public class PQElement {
    private int key;
    private Patients element;

    public PQElement(int priority, Patients p) {
        key = priority;
        element = p;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int val) {
        key = val;
    }

    public Patients getElement() {
        return element;
    }

    public void setElement(Patients p) {
        element = p;
    }

    public String printPatient(){
        String allPatients;
        allPatients = "Patient: " + element.getName() + " ";
        return allPatients;
    }
}