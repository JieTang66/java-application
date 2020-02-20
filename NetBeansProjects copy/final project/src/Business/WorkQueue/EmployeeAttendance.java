/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author too
 */
public class EmployeeAttendance extends WorkRequest{
    //每个employee都有一个requestlist，记录是否参加和原因，发给adminorgan.
    private int conferenceId;
    private String cname;
    private String clocation;
    private Date cdate;
    private Date ctime;
    private String poster;
    private String ename;
    private int employeeId;
    private String attendancestatus;
    private String reason;
    private String conferencestatues;

    public String getConferencestatues() {
        return conferencestatues;
    }

    public void setConferencestatues(String conferencestatues) {
        this.conferencestatues = conferencestatues;
    }
    
    public int getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(int conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getClocation() {
        return clocation;
    }

    public void setClocation(String clocation) {
        this.clocation = clocation;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAttendancestatus() {
        return attendancestatus;
    }

    public void setAttendancestatus(String attendancestatus) {
        this.attendancestatus = attendancestatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
     @Override
    public String toString() {
        return String.valueOf(conferenceId);
    }
    
}
