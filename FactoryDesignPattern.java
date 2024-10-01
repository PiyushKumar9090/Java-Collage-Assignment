

package FactoryDesign;

import java.util.Scanner;

abstract class Thali{
    private double price=0.0;

    public double getPrice(){
        return price;
    }
    protected void setPrice(double price){
        this.price += price;
    }
    public void makeThali(){
        System.out.println("Veg Thali will be ready in 30 minutes ...");
    }

    public abstract void addSabji(double price);
    public abstract void addDal(double price);
    public abstract void addRice(double price);
    public abstract void addRoti(double price);   

}
class GujaratiThali extends Thali{

    public void addSabji(double price){
        setPrice(price);
        System.out.println("Added Sabji to Gujarati Thali ...");
    }
    public void addDal(double price){
        setPrice(price);
        System.out.println("Added Dal to Gujarati Thali ...");
    }
    public void addRice(double price){
        setPrice(price);
        System.out.println("Added Rice to Gujarati Thali ...");
    }
    public void addRoti(double price){
        setPrice(price);    
        System.out.println("Added Roti to Gujarati Thali ...");
    }

}
class PunjabiThali extends Thali{

    public void addSabji(double price){
        setPrice(price);
        System.out.println("Added Sabji to Punjabi Thali ...");
    }
    public void addDal(double price){
        setPrice(price);
        System.out.println("Added Dal to Punjabi Thali ...");
    }
    public void addRice(double price){
        setPrice(price);
        System.out.println("Added Rice to Punjabi Thali ...");
    }
    public void addRoti(double price){
        setPrice(price);    
        System.out.println("Added Roti to Punjabi Thali ...");
    }
}

class ThaliRestaurant {
    
    public static Thali createThali(String type) {
        
        if (type.equalsIgnoreCase("Gujarati")) {
            return new GujaratiThali();
        }else if (type.equalsIgnoreCase("Punjabi")) {
            return new PunjabiThali();
        }else {
            throw new IllegalArgumentException("Unknown Thali type");
        }
    }
}


public class FactoryDesignPattern {
    public static void main(String[] args) {
    
        System.out.println();
        Thali gujaratiThali = ThaliRestaurant.createThali("Gujarati");
        gujaratiThali.addSabji(70.0);
        gujaratiThali.addDal(40.0);
        gujaratiThali.addRice(30.0);
        gujaratiThali.addRoti(10.0);
        gujaratiThali.makeThali();
        System.out.println("Total price of Gujarati Thali: " + gujaratiThali.getPrice());

        System.out.println("-----------------------------------------------------------");

        System.out.println();
        Thali punjabiThali = ThaliRestaurant.createThali("Punjabi");
        punjabiThali.addSabji(50.0);
        punjabiThali.addDal(30.0);
        punjabiThali.addRice(25.0);
        punjabiThali.addRoti(15.0);
        punjabiThali.makeThali();
        System.out.println("Total price of Punjabi Thali: " + punjabiThali.getPrice());
        
    }
}
