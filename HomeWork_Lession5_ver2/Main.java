package HomeWork_Lession5_ver2;

import java.util.Scanner;
import java.util.logging.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static int getCalcInt(int number1, int number2, char operation) {
        int result;
        switch (operation) {
            case '+': {
                result = number1 + number2;
                break;
            }
            case '-': {
                result = number1 - number2;
                break;
            }
            case '*': {
                result = number1 * number2;
                break;
            }
            case '/': {
                if (number2 != 0) {
                    result = number1 / number2;
                    break;
                } else {
                    System.out.println("Введите корректное второе число: ");
                    number2 = getNum();
                    result = number1 / number2;
                    break;
                }
            }
            default: {
                System.out.println("Операция не распознана");
                result = getCalcInt(number1, number2, getOperation());
            }
        }
        logger.info("Результат вычисления: " + number1 + " " + operation + " " + number2 + " = " + result);
        return result;
    }

    public static String getCalcRac(int numerator1, int denominator1, int numerator2, int denominator2,
            char operation) {
        String result;
        int numerator;
        int denominator;
        switch (operation) {
            case '+': {
                numerator = (numerator1 * denominator2) + (numerator2 * denominator1);
                denominator = denominator1 * denominator2;
                result = numerator + "/" + denominator;
                break;
            }
            case '-': {
                numerator = (numerator1 * denominator2) - (numerator2 * denominator1);
                denominator = denominator1 * denominator2;
                result = numerator + "/" + denominator;
                break;
            }
            case '*': {
                numerator = numerator1 * numerator2;
                denominator = denominator1 * denominator2;
                result = numerator + "/" + denominator;
                break;
            }
            case '/': {
                if (denominator1 != 0 || denominator2 != 0) {
                    numerator = numerator1 * denominator1;
                    denominator = denominator2 * numerator1;
                    result = numerator + "/" + denominator;
                    break;
                } else if (denominator1 == 0) {
                    System.out.println("Введите корректный первый делитель: ");
                    denominator1 = getNum();
                    numerator = numerator1 * denominator1;
                    denominator = denominator2 * numerator1;
                    result = numerator + "/" + denominator;
                    break;
                } else if (denominator2 == 0) {
                    System.out.println("Введите корректный второй делитель: ");
                    denominator2 = getNum();
                    numerator = numerator1 * denominator1;
                    denominator = denominator2 * numerator1;
                    result = numerator + "/" + denominator;
                    break;
                }
            }
            default: {
                System.out.println("Операция не распознана");
                result = getCalcRac(numerator1, denominator1, numerator2, denominator2, getOperation());
            }
        }
        logger.info("Результат вычисления: " + numerator1 + "/" + denominator1 + " " + operation + " " + numerator2
                + "/" + denominator2 + " = " + result);
        return result;
    }

    public static int choice() {
        System.out.println("Введите желаемое действие: \n 1. Работа с целыми числами \n 2. Работа с дробными числами");
        int choice;
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа");
            sc.next();
            choice = choice();
        }
        return choice;
    }

    public static void main(String[] args) throws Exception {
        

        Handler fileHandler = new FileHandler("HomeWork_Lession5/Log_task5.xml", true);
        logger.setUseParentHandlers(false);
        logger.addHandler(fileHandler);

        int choice = methodChoice.choice();

        int choice = choice();
        if (choice == 1) {
            int result = getCalcInt(getNum(), getNum(), getOperation());
            System.out.println("Результат операции: " + result);
        } else if (choice == 2) {
            String result = getCalcRac(getNum(), getNum(), getNum(), getNum(), getOperation());
            System.out.println("Результат операции: " + result);
        }
    }
}
