package Project.PizzaOrder;

import java.util.Scanner;

public class PizzaApp {
    public static PizzaType myorder;
    public static PizzaSize mysize;
    private static String sauce;

    public static void main(String[] args) {

        System.out.println("\nAvailable Sizes:");
        for (PizzaSize pizzaSize : PizzaSize.values()){
            System.out.println("- "+ pizzaSize.getPizzaSizeText());
        }

        System.out.println("\nAvailable Pizzas:");
        for (PizzaType pizzaType : PizzaType.values()){
            System.out.println("- "+ pizzaType.getPizzaTypeText());
        }
        System.out.println("\nPlace Your Order Here");
        System.out.println("Choose Pizza:");
        Scanner pizza = new Scanner(System.in);
        String order = pizza.nextLine();
        if(order.equalsIgnoreCase("margereta")){
            myorder = PizzaType.MARGERETA;
        } else if (order.equalsIgnoreCase("onion")) {
            myorder = PizzaType.ONION;
        }else if (order.equalsIgnoreCase("capsicum")) {
            myorder = PizzaType.CAPSICUM;
        }else if (order.equalsIgnoreCase("golden corn")) {
            myorder = PizzaType.GOLDENCORN;
        }else if (order.equalsIgnoreCase("Farmhouse")) {
            myorder = PizzaType.FARMHOUSE;
        }else if (order.equalsIgnoreCase("Chicken")) {
            myorder = PizzaType.CHICKEN;
        }else {
            System.out.println("Sorry for inconvenience! We don't have this Pizza.");
        }

        System.out.println("Choose Size of your Pizza:");
        Scanner how = new Scanner(System.in);
        String size = how.nextLine();
        if(size.equalsIgnoreCase("small")){
            mysize = PizzaSize.SMALL;
        } else if (size.equalsIgnoreCase("medium")) {
            mysize = PizzaSize.MEDIUM;
        }else if (size.equalsIgnoreCase("large")) {
            mysize = PizzaSize.LARGE;
        }else {
            System.out.println("Sorry for inconvenience! We don't have this Size.");
        }
        System.out.println("Do you want extra sauce with your delicious Pizza (Yes/No):");
        Scanner ques = new Scanner(System.in);
        String extra = ques.nextLine();
        if (extra.equalsIgnoreCase("yes")){
            sauce = "Extra Sauce Added Successfully!";
        }else {
            sauce = "No sauce added.";
        }

        if (myorder!=null && mysize!=null && sauce!=null) {
            Pizza pizzaOrder = new Pizza(myorder, mysize);
            System.out.println("I ordered the following pizza:");
            System.out.println("Pizza Name: " + pizzaOrder.getPizzaType().getPizzaTypeText());
            System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
            System.out.println("Sauce: " +sauce);
            System.out.println("Price : $" + pizzaOrder.getPrice(extra)+"(approx) --> $"+Math.ceil(pizzaOrder.getPrice(extra)));
        }else{
            System.out.println("Please select order from list and try again.");
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Pizza order Id: "+pizza.hashCode());

    }
}
