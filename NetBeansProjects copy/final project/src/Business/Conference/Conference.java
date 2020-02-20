/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Conference;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author too
 */
public class Conference {
    private String name;
    private Date date;
    private Date time;
    private String location;
    private static int count = 1;
    private int ID;
    private String status;
    private String creater;
    private int createrid;
    public Conference() {
        ID = count;
        count++;
        status = "Upcoming";
    }

    public int getCreaterid() {
        return createrid;
    }

    public void setCreaterid(int createrid) {
        this.createrid = createrid;
    }

    
    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Conference.count = count;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String getContent() {
        return name;
    }

    public void setContent(String content) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
    @Override
        public String toString(){
        return String.valueOf(ID);
    }
}
