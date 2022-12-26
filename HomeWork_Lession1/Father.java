package HomeWork_Lession1;

import java.util.LinkedHashSet;

public class Father extends People {

    private LinkedHashSet<People> children = new LinkedHashSet<>();

    public Father(int id, String name, String gender, int age, String socialStatus) {
        super(id, name, gender, age, socialStatus);
    }

    public void addChildren (People children){
        this.children.add(children);
    }

    public LinkedHashSet<People> getChildren(){
        return children;
    }

    @Override
    public void Hello() {
        super.Hello();
        System.out.println(" , я папа");
    }

}
