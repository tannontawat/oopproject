package command;


public class product {
    private String ProID,Name,type; 
    private float  price;

    public product() {
        
    }
    
    public void setProId(String proid){
        this.ProID=proid;
    }
    public  String getProId(){
        return this.ProID;
    }
    
    public void setName(String name){
        this.Name=name;
    }
    public String getName(){
        return this.Name;
    }
    
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
    
    public void setPrice(float price){
        this.price=price;
    }
    public float getPrice(){
        return this.price;
    }
}