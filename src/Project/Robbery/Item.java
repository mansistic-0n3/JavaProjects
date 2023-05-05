package Project.Robbery;

public class Item {
    private String itemName;
    private double value;

    public Item(String itemName, double value) {
        this.itemName = itemName;
        this.value = value;
    }

    public String getItemName() {
        return itemName;
    }

    public double getValue() {
        return value;
    }
}
