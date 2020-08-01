/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalesystem;

/**
 *
 * @author Manmath
 */
class PaymentDetails {
    
    private int receiptNumber;
    private OrderDetails orderDetails;
    private String paymentMode;
    private OrderInterface orderInterface;
    
    public PaymentDetails(int receiptNumber, OrderDetails orderDetails, String paymentMode)
    {
        this.receiptNumber = receiptNumber;
        this.orderDetails = orderDetails;
        this.paymentMode = paymentMode;
    }
    
    public int getReceiptNumber(){
        return this.receiptNumber;
    }
    public void setReceiptNumber(int receiptNumber){
        this.receiptNumber = receiptNumber;
    }
    public OrderDetails getOrderDetails(){
        return this.orderDetails;
    }
    public String getPaymentMode(){
        return this.paymentMode;
    }
    public void setPaymentMode (String paymentMode){
        this.paymentMode = paymentMode;
    }
    
    @Override
    public String toString(){
        return receiptNumber + " " + paymentMode;
    }
}
