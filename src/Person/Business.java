package Person;

public class Business extends Personality{

    private int profit;
    private double salary;


    public Business(String title, String qualification, int age, String company, int experience, char gender, int profit, double salary) {
        super(title, qualification, age, company, experience, gender);
        this.profit=profit;
        this.salary=salary;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Yearly Profit percentage: "+profit+"%");
        System.out.println("Monthly Salary: Rs."+salary);
    }
}
