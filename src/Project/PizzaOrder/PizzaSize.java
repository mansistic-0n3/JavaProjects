package Project.PizzaOrder;

public enum PizzaSize {
    SMALL("Small Pizza"), MEDIUM("Medium Pizza"), LARGE("Large Pizza");
    private String pizzaSizeText;
    PizzaSize(String pizzaSizeText){
        this.pizzaSizeText =pizzaSizeText;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }
}
