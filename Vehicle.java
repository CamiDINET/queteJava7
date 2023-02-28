public abstract class Vehicle {

private String brand;
private int kilometers;
public Vehicle(int kilometers, String brand){
    this.kilometers = kilometers;
    this.brand = brand;
}
public String getBrand() {
    return this.brand;  
    }  
public int getKilometers() {
    return this.kilometers;  
    }  
public void setKilometers(int kilometers) {
    this.kilometers = kilometers;  
}
public void setBrand(String brand) {
    this.brand = brand;  
}


public abstract String doStuff();
}
