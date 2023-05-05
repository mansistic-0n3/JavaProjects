package Project.Robbery;

import java.util.Random;

public class Police {
    private Detective sher;

    Police(){
        Item[] sherItem = new Item[2];
        sherItem[0] = new Item("Revolver", 500.0);
        sherItem[1] = new Item("Magnifying Glass", 10.0);
        sher = new Detective("Sherlock Holmes","Sher",1854,"Puzzle Solving",sherItem );
    }

    public boolean catchCriminals(Gang gang){
        if (areCaught()){
            System.out.println(sher.getName()+ " managed to catch Gang!");
            if (gang.getSumRobbery()>0){
                System.out.println("The stolen items are recovered.");
                System.out.println("Estimated overall value is $"+gang.getSumRobbery());
            }else {
                System.out.println("The gang couldn't steal anything.");
            }
            return true;
        }else {
            System.out.println(sher.getName()+" couldn't catch the criminals!");
            System.out.println("They managed to steal items valued $"+gang.getSumRobbery());
            return false;
        }

    }

    private  boolean areCaught(){
        Random random = new Random();
        if(random.nextInt(101)>= Detective.sucessPercent){
            return false;
        }
        return true;
    }
}
