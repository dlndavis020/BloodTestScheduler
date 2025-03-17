/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dylan.projects.bloodtestscheduler;

/**
 * @author Dylan White X21130515
 * BloodTestScheduler
 */

//Method to calculate the value to be assigned to a patient based of the urgency of the illness
public class PriorityAssignment {
    public int urgencyLevel(boolean urgencyLow, boolean urgencyMedium, boolean urgencyUrgent) {
        if(urgencyLow) {
            return 1;
        }else if(urgencyMedium) {
            return 2;
        }else if(urgencyUrgent) {
            return 3;
        }
        return 0;
    }

    //Method to calculate the value to be assigned to a patient if he is coming from a hospital
    public int hospitalRequirement(boolean hospitalYes, boolean hospitalNo) {
        if(hospitalYes) {
            return 3;
        }else if(hospitalNo) {
            return 1;
        }
        return 0;
    }

    //Method to calculate the value to be assigned to a patient based on their age
    public int agePriority(int age) {
        if(age < 30){
            return 1;
        }else if(age >= 30 && age < 60) {
            return 2;
        }else if(age >= 60) {
            return 3;
        }
        return 0;
    }

    //Method to calculate a Patients overall priority based on the above 3 results
    public int priorityLevel(int urgencyLevel, int hospitalRequirement, int agePriority) {
        return urgencyLevel + hospitalRequirement + agePriority;
    }
}
