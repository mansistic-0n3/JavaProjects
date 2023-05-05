package Project.PizzaOrder;

import java.util.Objects;

public class Pizza{
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;

    private Double price;
    private double priceSize;
    private double priceType;

    public Pizza(PizzaType pizzaType, PizzaSize pizzaSize ) {
        this.pizzaType =pizzaType;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        priceSize=sizePrice();
        priceType=typePrice();
        price= priceSize*priceType;
        return price;
    }

    private double typePrice() {
        switch (pizzaType){
            case MARGERETA :
            default:
                return 3.87;
            case CAPSICUM :
                return 2.1;
            case ONION :
                return  2.2;
            case FARMHOUSE:
                return 4.5;
            case CHICKEN:
                return 5.2;
            case GOLDENCORN:
                return 2.4;
        }
    }

    private double sizePrice(){
        switch (pizzaSize){
            case SMALL :
            default:
                return  1.29;
            case MEDIUM :
                return  2.84;
            case LARGE :
                return  4.48;
        }

    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Double getPrice(String sauce) {
        if (sauce.equalsIgnoreCase("yes")){
            price+=0.8;
        }
        return price;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(pizzaType,pizzaSize,price);
        int result = 7;
//            result = 31 * result +(int) (price*10000);
            result = 31 * result + Double.valueOf(price).hashCode();
            result = 31 * result + (pizzaSize == null ? 0 : pizzaSize.hashCode());
            result = 31 * result + (pizzaType == null ? 0 : pizzaType.hashCode());
        return result;
    }

}
