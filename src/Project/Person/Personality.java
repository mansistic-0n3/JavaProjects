package Project.Person;

public abstract class Personality {
    private String title;
    private String qualification;
    private int age;
    private String company;
    private int experience;
    private char gender;

    public Personality(String title, String qualification, int age,String company, int experience, char gender) {
        this.title = title;
        this.qualification = qualification;
        this.age = age;
        this.company=company;
        this.experience = experience;
        this.gender = gender;
    }

    public String getTitle(){
        return title;
    }

    public void getDescription(){
        System.out.println(title+" ("+company+") ");
        System.out.println("Age: "+age+"\t\tGender: "+gender);
        System.out.println("Highest Qualification " + qualification + " and has experience of "+ experience +" years.");
    }
}
