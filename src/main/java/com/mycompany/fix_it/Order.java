package com.mycompany.fix_it;

import java.util.Date;

public class Order {
    private String OID;
    private Customer customer;
    private Service service;
    private double Total;
    private Date Order_Date;

    public String getOID() {
        return OID;
    }

    public void setOID(String OID) {
        this.OID = OID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public Date getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(Date Order_Date) {
        this.Order_Date = Order_Date;
    }

    public Order(String OID, Customer customer, Service service, double Total, Date Order_Date) {
        this.OID = OID;
        this.customer = customer;
        this.service = service;
        this.Total = Total;
        this.Order_Date = Order_Date;
    }
    
    public Order(){
        
    }
    
}
