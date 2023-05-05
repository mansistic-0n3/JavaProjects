package Project.Robbery;

public abstract class Human {
    private String name;
    private String nickname;
    private int yearOfBorn;
    private String expert;
    private Item[] items;

    public Human(String name, String nickname, int yearOfBorn, String expert, Item[] items) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.expert = expert;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public void printBioData(){

        System.out.println(name+" ("+nickname+") ");
        System.out.println("Born in "+yearOfBorn);
        System.out.println("Expertize in "+expert);
        System.out.println(name+" has following items:  ");
        for (Item item: items){
            System.out.println("-"+item.getItemName());
        }
    }
}
