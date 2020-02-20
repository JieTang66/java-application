/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Conference.Conference;
import Business.Conference.ConferenceDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author wuxinyang
 */
public class Employee {
     private String name;
    private int id;
    private static int count = 1;
    private ConferenceDirectory conferenceDir;
    private WorkQueue workqueue;

    public Employee() {
        id = count;
        count++;
        conferenceDir = new ConferenceDirectory();
        workqueue = new WorkQueue();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    
    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public ConferenceDirectory getConferenceDir() {
        return conferenceDir;
    }

    public void setConferenceDir(ConferenceDirectory conferenceDir) {
        this.conferenceDir = conferenceDir;
    }

    
    
    @Override
    public String toString() {
        return name;
    }
}
