package HomeWork_Lession5_ver2;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getMethod(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void printInt(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public void printRac(String data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
