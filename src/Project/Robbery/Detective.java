package Project.Robbery;

public class Detective extends Human{
    public static final int sucessPercent=60;

    public Detective(String name, String nickname, int yearOfBorn, String expert, Item[] items) {
        super(name, nickname, yearOfBorn, expert, items);

    }

    @Override
    public void printBioData() {
        System.out.println("-----------------------------------------------------");
        System.out.println("DETECTIVE : ");
        super.printBioData();

    }
}
