package Project.Person;

public class Programmer extends Personality implements Certification {
    private String skill;
    private String jobProfile;
    public Programmer(String title, String qualification, int age, String company, int experience, char gender, String skill, String jobProfile) {
        super(title, qualification, age, company, experience, gender);
        this.skill=skill;
        this.jobProfile=jobProfile;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Specialized in "+skill);
        System.out.println("Role in company: "+jobProfile);
    }

    @Override
    public void java() {
        System.out.println(super.getTitle()+" Certified Java Developer.");
    }

    @Override
    public void testing() {
        System.out.println(super.getTitle()+" Certified Software Tester.");
    }

    @Override
    public void db() {
        System.out.println(super.getTitle()+" Certified in Backend (Database Management system).");
    }
}
