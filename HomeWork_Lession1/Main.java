package HomeWork_Lession1;

public class Main {
    // Integer id, String name, String gender, Integer age, String socialStatus
    public static void main(String[] args) {
        Mother mother = new Mother(1, "Татьяна", "femail", 55, "мать");
        Father father = new Father(2, "Игорь", "mail", 60, "отец");
        Children child1 = new Children(3, "Юлия", "femail", 25, "ребенок",father,mother);
        Children child2 = new Children(4, "Саша", "mail", 30, "ребенок",father,mother);
        mother.Hello();
        father.Hello();
        child1.Hello();
        child2.Hello();
        mother.addChildren(child1);
        mother.addChildren(child2);
        father.addChildren(child1);
        father.addChildren(child2);
        System.out.println(mother.getChildren());
        System.out.println(father.getChildren());
        System.out.println("моя мама " + child1.getMother());
        System.out.println("мой папа " + child1.getFather());
    }   
}
