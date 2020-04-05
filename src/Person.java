public class Person {
    private String name;
    private String gender;
    private String dateOfBirth;

    public Person() {
    }

    public Person(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void display ()  {
        System.out.printf("%-18s%-13s%-5s\n",this.name, this.gender,this.dateOfBirth);
    }
}
