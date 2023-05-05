package Project.Robbery;

public class Building {

    private String buildingName;
    private Item[] items;

    public Building(String buildingName, Item[] items) {
        this.buildingName = buildingName;
        this.items = items;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public Item[] getItems() {
        return items;
    }
}
