/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dylan.projects.bloodtestscheduler;

/**
 * @author Dylan White X21130515
 * BloodTestScheduler
 * This class is for main attributes of all patients
 */
public class Patients {
    private String name;
    private String gpName;
    private String gpAddress;
    private String age;

    public Patients() {
        name = "";
        gpName = "";
        gpAddress = "";
        age = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGpName() {
        return gpName;
    }

    public void setGpName(String gpName) {
        this.gpName = gpName;
    }

    public String getGpAddress() {
        return gpAddress;
    }

    public void setGpAddress(String gpAddress) {
        this.gpAddress = gpAddress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
