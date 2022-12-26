package HomeWork_Lession1;

/*
 * генеалогическое древо
 */

public class People {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String socialStatus;

    // public People(int id, String name, String gender, int age, String socialStatus) {
    // }

    public People(Integer id, String name, String gender, Integer age, String socialStatus) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.socialStatus = socialStatus;
    }

    public Integer getId() {return id;}

    public String getName() {return name;}

    public String getGender() {return gender;}

    public Integer getAge() {return age;}

    public String getSocialStatus() {return socialStatus;}

    public void setID(Integer id) {this.id = id;}

    public void setName(String name) {this.name = name;}

    public void setGender(String gender) {this.gender = gender;}

    public void setAge(Integer age) {this.age = age;}

    public void setSocialStatus(String socialStatus) {this.socialStatus = socialStatus;}

    public void Hello() {
        System.out.printf("Привет, я %s!", name);
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
}