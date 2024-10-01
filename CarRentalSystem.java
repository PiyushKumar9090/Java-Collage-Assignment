
package CarPackage;

class Vehicle {
    private String name;
    private String manufacturer;

    public Vehicle(String name,String manufacturer){
        this.name = name;
        this.manufacturer = manufacturer;
    }
    public void startEngine(){
        System.out.println("Vehicle Engine is Started ...");
    }

    public String getName(){
        return name;
    }
    public String getManufacturer(){
        return manufacturer;
    }


}
class Car extends Vehicle{

    private int numDoors;

    public Car(String name,String manufacturer,int numDoors){
        super(name, manufacturer);
        this.numDoors = numDoors;
    }

    public void honkHorn(){
        System.out.println("Honking the Horn ...");
    }
    public int getNumDoors(){
        return numDoors;
    }
}
class SportsCar extends Car{

    private int topSpeed;

    public SportsCar(String name,String manufacturer,int numDoors,int topSpeed){
        super(name,manufacturer,numDoors);
        this.topSpeed = topSpeed;
    }
    public int  getTopSpeed(){
        return topSpeed;
    }
    public void activateTurbo(){
        System.out.println("Activated Turbo Mode for SportsCar ...");
    }

}

public class CarRentalSystem {
    
    public static void main(String[] args) {

        System.out.println();
        Vehicle v1=new Vehicle("My Vehicle", "General Manufacturer");
        Car c1=new Car("My Personal Car", "Private Manufacturer", 4);
        SportsCar s1=new SportsCar("My Sports Car", "Sports Car Manufacturer", 2,250);

        System.out.println("------------------------------------------------------------");
        System.out.println("Vehicle Informations ...");
        System.out.println("Vehicle Name : "+v1.getName());
        System.out.println("Vehicle Manufacturer : "+v1.getManufacturer());
        v1.startEngine();

        System.out.println("---------------------------------------------------------------");
        System.out.println("Car Informations ...");
        System.out.println("Car Name : "+c1.getName());
        System.out.println("Car Manufacturer : "+c1.getManufacturer());
        System.out.println("Car NO. of Doors : "+c1.getNumDoors());
        c1.startEngine();
        c1.honkHorn();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Sports Car Informations ...");
        System.out.println("Sports Car Name : "+s1.getName());
        System.out.println("Sports Car Manufacturer : "+s1.getManufacturer());
        System.out.println("Sports Car NO. of Doors : "+s1.getNumDoors());
        System.out.println("Sports Car Top Speed : "+s1.getTopSpeed());
        s1.startEngine();
        s1.honkHorn();
        s1.activateTurbo();

        System.out.println();

    }
}
