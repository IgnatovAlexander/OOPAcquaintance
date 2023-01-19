package HomeWork_Lession5_ver2;

import java.util.Scanner;

public class methodChoice {

    Scanner sc = new Scanner(System.in);
    View view;
    public int choice(){

        int method = view.getMethod("Введите желаемое действие: \n 1. Работа с целыми числами \n 2. Работа с дробными числами");
 
        if (sc.hasNextInt()) {
            method = sc.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа");
            sc.next();
            method = choice();
        }
        return method;
    }
}
