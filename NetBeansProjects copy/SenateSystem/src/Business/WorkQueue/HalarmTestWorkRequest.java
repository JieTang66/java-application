package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangqijia
 */
public class HalarmTestWorkRequest extends WorkRequest {
    private UserAccount nurse_toSend;
    private String testResult;

    public UserAccount getNurse_toSend() {
        return nurse_toSend;
    }

    public void setNurse_toSend(UserAccount nurse_toSend) {
        this.nurse_toSend = nurse_toSend;
    }
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}
