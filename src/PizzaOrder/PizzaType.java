package PizzaOrder;

public enum PizzaType {
    MARGERETA("Margereta"),ONION("Onion"),CAPSICUM("Capsicum"),GOLDENCORN("Golden Corn"),FARMHOUSE("Farmhouse"),CHICKEN("Chicken");

    private String pizzaTypeText;
    PizzaType(String pizzaTypeText){
        this.pizzaTypeText =pizzaTypeText;
    }

    public String getPizzaTypeText() {
        return pizzaTypeText;
    }
}
