package Person;

public class Actor extends Personality{

    private int noOfMovie;
    private String famousMovie;
    public Actor(String title, String qualification, int age, String company, int experience, char gender, int noOfMovie, String famousMovie) {
        super(title, qualification, age, company, experience, gender);
        this.noOfMovie=noOfMovie;
        this.famousMovie=famousMovie;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Total Movies: "+noOfMovie);
        System.out.println("Most popular Movie: "+famousMovie);
    }
}
