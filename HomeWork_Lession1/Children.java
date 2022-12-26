package HomeWork_Lession1;

public class Children extends People {
    private Integer motherId;
    private Integer fatherId;
    private Father father;
    private Mother mother;

    public Integer getMotherId() {
        return motherId;
    }

    public void setMotherId(Integer motherId) {
        this.motherId = motherId;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Children(int id, String name, String gender, int age, String socialStatus, Father father, Mother mother) {
        super(id, name, gender, age, socialStatus);
        this.father = father;
        this.mother = mother;
    }

    public People getFather(){
        return father;
    }

    public People getMother(){
        return mother;
    }

    @Override
    public void Hello() {
        super.Hello();
        System.out.println(" , я ребенок");
    }
}
