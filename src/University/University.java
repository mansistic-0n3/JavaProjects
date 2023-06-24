package University;

import java.util.Scanner;

public class University {

    public static void main(String[] args) {
        GGSIPU g = new GGSIPU();
        DU d = new DU();
        Amity a = new Amity();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your course:");
        String c = sc.nextLine();
        if(c.equalsIgnoreCase("BBA")|| (c.equalsIgnoreCase("MBBS"))){
            System.out.println("Your course is "+c);
            a.match();
            a.best();
            a.exam();
            a.placement();
            System.out.println("Do you want to know Top Placement companies here?\t( Yes / No )");
            String yn = sc.nextLine();
            if(yn.equalsIgnoreCase("y")||(yn.equalsIgnoreCase("yes"))){
                a.co();
            }else{
                System.out.println("Thank you...\nHave a great day!");
            }
        } else if (c.equalsIgnoreCase("BCA") || (c.equalsIgnoreCase("MCA"))){
            System.out.println("Your course is "+c);
            g.match();
            g.best();
            g.exam();
            g.placement();
            System.out.println("Do you want to know Top Placement companies here?\t( Yes / No )");
            String yn = sc.nextLine();
            if(yn.equalsIgnoreCase("y")||(yn.equalsIgnoreCase("yes"))){
                g.co();
            }else{
                System.out.println("Thank you...\nHave a great day!");
            }
        }else if (c.equalsIgnoreCase("BMS") || (c.equalsIgnoreCase("MBA"))){
            System.out.println("Your course is "+c);
            d.match();
            d.best();
            d.exam();
            d.placement();
            System.out.println("Do you want to know Top Placement companies here?\t( Yes / No )");
            String yn = sc.nextLine();
            if(yn.equalsIgnoreCase("y")||(yn.equalsIgnoreCase("yes"))){
                d.co();
            }else{
                System.out.println("Thank you...\nHave a great day!");
            }
    }else {
            System.out.println(c+" course in not available.\nTry again Later!");
        }
}

interface Uni{
    void exam();
    void placement();
    void best();
    void match();
    void co();
}

static class GGSIPU implements Uni {
    @Override
    public void exam() {
        System.out.println("GGSIPU conduct offline Exam");
    }

    @Override
    public void placement() {
        System.out.println("90% Placements");
    }

    @Override
    public void best() {
        System.out.println("Best courses are : \n1) BCA\n2) MCA");
    }

    @Override
    public void match() {
        System.out.println("---------------------------------\nPerfect match for you is GGSIPU\n---------------------------------");
    }

    @Override
    public void co() {
        System.out.println("Top Placement companies : \nAMAZON\nRAPIDO\nTATA 1mg");
    }
}

static class DU implements Uni {
    @Override
    public void exam() {
        System.out.println("DU conducts open book exam Exam");
    }

    @Override
    public void placement() {
        System.out.println("60% Placements");
    }

    @Override
    public void best() {
        System.out.println("Best courses are : \n1) BMS\n2) MBA");
    }

    @Override
    public void match() {
        System.out.println("---------------------------------\nPerfect match for you is DU\n---------------------------------");
    }

    @Override
    public void co() {
        System.out.println("Top Placement companies : \nGOOGLE\nAPPLE\nDELOITTE");
    }
}

static class Amity implements Uni {
    @Override
    public void exam() {
        System.out.println("Amity conducts online Exam");
    }

    @Override
    public void placement() {
        System.out.println("80% Placements");
    }

    @Override
    public void best() {
        System.out.println("Best courses are : \n1) BBA\n2) MBBS");
    }

    @Override
    public void match() {
        System.out.println("---------------------------------\nPerfect match for you is Amity\n---------------------------------");
    }

    @Override
    public void co() {
        System.out.println("Top Placement companies : \nCISCO\nAccenture\nAIRTEL");
    }
}
}