public class Boat extends Vehicle {

    	public Boat(int kilometers, String brand) {  
        super(kilometers, brand);    
	}

 @Override
    public String doStuff() {
        System.out.println("Je suis " + this.getBrand() + " et je fais glou glou !");
        return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}
