package Project.Robbery;

public class City {
    private Building[] buildings = new Building[4];

    public City(){
        Item[] bankItems = new Item[2];
        bankItems[0]=new Item("Letter Opener",1.5);
        bankItems[1]=new Item("Stapler",5.5);
        buildings[0] = new Building("Bank", bankItems);

        Item[] mansionItems = new Item[2];
        mansionItems[0]=new Item("Pair of fancy shoes",25.8);
        mansionItems[1]=new Item("Broken Glass",0.1);
        buildings[1] = new Building("Mansion", mansionItems);

        Item[] postOfficeItems = new Item[2];
        postOfficeItems[0]=new Item("Pencil",1.5);
        postOfficeItems[1]=new Item("Stamp",2.5);
        buildings[2] = new Building("Post Office", postOfficeItems);

        Item[] superMarketItems = new Item[2];
        superMarketItems[0]=new Item("A loaf of bread",3.5);
        superMarketItems[1]=new Item("A bag of tea",6.5);
        buildings[3] = new Building("Super market", superMarketItems);
    }

    public Building[] getBuildings(){
        return buildings;
    }

}
