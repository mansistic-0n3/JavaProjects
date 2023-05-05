package Robbery;

import java.util.Random;

public class Gang {
    private Criminal[] criminals = new Criminal[2];
    private Random random = new Random();
    private double sumRobbery;

    Gang(){
        Item[] robItems = new Item[2];
        robItems[0] = new Item("Blunt Swiss Knife", 10.5);
        robItems[1] = new Item("Half Rotten apple", 0.0);
        Criminal rob = new Criminal("Rob", "The Head", 1976, "Breaking in", robItems);
        criminals[0]=rob;

        Item[] bobbyItems = new Item[2];
        bobbyItems[0] = new Item("Baseball Bat", 25.5);
        bobbyItems[1] = new Item("Toothpick", 0.0);
        Criminal bobby = new Criminal("Bobby", "The Mountain", 1978, "Knocking out", bobbyItems);
        criminals[1]=bobby;
    }

    public double getSumRobbery() {
        return sumRobbery;
    }

    public void getGangInfo(){
        for (Criminal criminal:criminals){

            criminal.printBioData();
            System.out.println("------------------------------------------------------------------");
        }
    }

    private boolean isSuccessful(){
        int randomNum= random.nextInt(101);
        int summarizedSuccess = criminals.length * Criminal.SUCCESS_PERCENT;

        if (randomNum >=summarizedSuccess){
            return false;
        }
        return true;
    }

    public void letsRob(Building[] buildings){
        int randomBuildingIndex = random.nextInt(buildings.length);
        if (isSuccessful()){
            System.out.println("The gang managed to rob the following items from the "+buildings[randomBuildingIndex].getBuildingName() + " :");
            for (Item item: buildings[randomBuildingIndex].getItems()){
                sumRobbery += item.getValue();
                System.out.println("-"+item.getItemName());
            }
        }else {
            System.out.println("The gang tried to rob the "+ buildings[randomBuildingIndex].getBuildingName() + " out, but they failed!");
        }
    }
}
