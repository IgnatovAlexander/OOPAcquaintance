package HomeWork_Lession5_ver2;

import java.util.Scanner;
import java.util.logging.*;

public class Program {

    static Scanner sc = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    methodChoice methodChoice;

    public static void main(String[] args) throws Exception {

        Handler fileHandler = new FileHandler("HomeWork_Lession5/Log_task5.xml", true);
        logger.setUseParentHandlers(false);
        logger.addHandler(fileHandler);
        int a = methodChoice;

        PresenterInt p = new PresenterInt(new SumModelInt(), new View());
        p.buttonClick();
    }
}
