
public class Service {
    private String SID;
    private String Name;
    private Double Price;

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

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public Service(String SID, String Name, Double Price ) {
        this.SID = SID;
        this.Name = Name;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "SID='" + SID ;
    }

    public Service(){
        
    }

    
}
