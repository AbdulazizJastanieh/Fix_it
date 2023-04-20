package com.mycompany.fix_it;

public class Service {
    private String SID;
    private String Name;
    private int Price;

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public Service(String SID, String Name, int Price) {
        this.SID = SID;
        this.Name = Name;
        this.Price = Price;
    }
    
    public Service(){
        
    }
    
}
