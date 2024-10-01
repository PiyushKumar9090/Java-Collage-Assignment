
package PizzaOrderPackage;

import java.util.Scanner;

interface PizzaOrderSystem {

    public void placeOrder(String pizzaType, int quantity);
    public String checkOrderStatus(int orderId);
    public boolean cancelOrder(int orderId);
    public double calculateOrderCost(int orderId);
    public void listAvailablePizzas();
}

class PizzaOrderProcessor implements PizzaOrderSystem {

    private int nextOrderId = 1; 
    int quantity;

    public int getNextOrderId(){
        return nextOrderId;
    }
    public void listAvailablePizzas(){
        System.out.println("Available Pizza Options :");
        System.out.println("1. Margherita Pizza");
        System.out.println("2. New York Style Pizza");
        System.out.println("3. Sicilian Pizza");
        System.out.println("4. Chicago Deep-Dish Pizza");

    }
    public double calculateOrderCost(int orderId){
        double cost = orderId * 100.00;

        System.out.println("Order "+orderId + " Total Cost : RS."+cost);
        return cost;
    }
    public boolean cancelOrder(int orderId){

        if(orderId%2 == 0){
            System.out.println("Order "+orderId+" has been canceled.");
            return true;
        }
        else{
            System.out.println("Order "+orderId+" cannot be Canceled.");
            return false;
        }

    }
    public String checkOrderStatus(int orderId){
        String s1 = "Order "+orderId+"is being Prepared.";
        return s1;
    }
    public void placeOrder(String pizzaType, int quantity){

        int orderId = getNextOrderId();
        System.out.println("Enter Pizza Type : ");
        Scanner s1=new Scanner(System.in);
        pizzaType = s1.nextLine();

        System.out.println("Enter Quantity :");
        Scanner s2=new Scanner(System.in);
        quantity = s2.nextInt();

        System.out.println("Order placed - Order ID: " + orderId + ", Pizza Type: " + pizzaType + ", Quantity: " + quantity);

        

    }

}

public class PizzaOrderSystemExample {
    
    public static void main(String[] args) {
        
        PizzaOrderSystem pizzaOrderSystem=new PizzaOrderProcessor();

        pizzaOrderSystem.listAvailablePizzas();
        System.out.println();

        int orderId = 1; 
        String orderStatus = pizzaOrderSystem.checkOrderStatus(orderId);
        System.out.println(orderStatus);
        System.out.println();

        pizzaOrderSystem.calculateOrderCost(orderId);
        System.out.println();

        boolean isCanceled = pizzaOrderSystem.cancelOrder(orderId);
        if (isCanceled) 
        {
            System.out.println("Order has been canceled.");
        } else
        {
            System.out.println("Order cancellation failed.");
        }
    }
}
