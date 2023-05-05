package Robbery;

public class Criminal extends Human{

    public static final int SUCCESS_PERCENT = 20;

    public Criminal(String name, String nickname, int yearOfBorn, String expert, Item[] items) {
        super(name, nickname, yearOfBorn, expert, items);

    }

    @Override
    public void printBioData() {
        System.out.println("CRIMINALS : ");
        super.printBioData();

    }
}
