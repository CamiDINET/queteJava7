public class Car extends Vehicle {


	public Car(int kilometers, String brand) {  
        super(kilometers, brand);
	}

 @Override
    public String doStuff() {
        System.out.println("Je suis " + getKilometers() + " et je fais vroom vroom !");
        return "Je suis " + getBrand() + " et je fais vroom vroom !";
    }

}
