/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DomainModel;

/**
 *
 * @author felesiah
 */
public class Order{
    
    private int idOrder;
    private int payment;
    private String date;
    private int CustomerId;

    public Order(int id, int payment, String date,int orderid) {
        this.idOrder = id;
        this.payment = payment;
        this.date = date;
        this.CustomerId = orderid;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }
    
}