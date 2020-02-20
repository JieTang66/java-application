/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author wuxinyang
 */
public class MessageReplyRequest extends WorkRequest {
   private String replyMessage;
   private int OrderId;
   private String CSRName;
   private String replyStatus;
   private String customerName;

    public String getReplyMessage() {
        return replyMessage;
    }

    public void setReplyMessage(String replyMessage) {
        this.replyMessage = replyMessage;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    public String getCSRName() {
        return CSRName;
    }

    public void setCSRName(String CSRName) {
        this.CSRName = CSRName;
    }

    public String getReplyStatus() {
        return replyStatus;
    }

    public void setReplyStatus(String replyStatus) {
        this.replyStatus = replyStatus;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    
   
    @Override
    public String toString() {
        return CSRName;
    }
}
