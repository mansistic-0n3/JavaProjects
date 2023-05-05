package Project.Person;

public class Bio {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------");
        Business kapil = new Business("Kapil Sharma","BBA",26,"Infosys",2, 'M',28,44000.0);
        kapil.getDescription();

        System.out.println("-------------------------------------------------------------------");

        Programmer mansi = new Programmer("Mansi Chaurasia", "MCA", 23, "IGT Solutions", 1,'F',"Communication","Tester!");
        Programmer akash = new Programmer("Akash Sehdev", "MCA", 25, "Logicials", 0,'M',"UI/UX","Developer!");

        Programmer[] prog = new Programmer[2];
        prog[0]=mansi;
        prog[1]=akash;
        for(Programmer programmer:prog){
            programmer.getDescription();
            System.out.println("-------------------------------------------------------------------");
        }
        akash.java();
        mansi.db();
        mansi.testing();

        System.out.println("-------------------------------------------------------------------");

        Actor deepika = new Actor("Deepika Padukone", "B.Com", 37, "Film Industry", 20, 'F',45,"Yeh Jawani Hai Deewani");
        Actor srk = new Actor("Shah Rukh Khan", "BJMC", 57, "Film Industry", 41, 'M',108,"Veer-Zara");

        Actor[] actors = new Actor[2];
        actors[0]=deepika;
        actors[1]=srk;
        for(Actor actor:actors){
            actor.getDescription();
            System.out.println("-------------------------------------------------------------------");
        }
    }
}
