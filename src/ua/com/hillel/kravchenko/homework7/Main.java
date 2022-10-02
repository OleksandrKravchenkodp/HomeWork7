package src.ua.com.hillel.kravchenko.homework7;

public class Main {

    public static void main(String[] args) {
        //Вариант, когда и строка и массив не пустые и длина строки - четное кол-во символов
        System.out.println("Вариант, когда и строка и массив не пустые и длина строки - четное кол-во символов");
        StringHelper stringHelper = new StringHelper();
        stringHelper.stringTransformation("FirstLine", new char[]{'S', 'e', 'c', 'o', 'n', 'd'});

        System.out.println("------------------------");

        //Вариант, когда и строка и массив не пустые и длина строки - НЕчетное кол-во символов
        System.out.println("Вариант, когда и строка и массив не пустые и длина строки - нечетное кол-во символов");
        stringHelper.stringTransformation("Lines", new char[]{'S', 'u', 'p', 'e', 'r', 'X', 'X'});

        System.out.println("------------------------");

        //Вариант, когда одна из строк пустая
        System.out.println("Вариант, когда одна из строк пустая");
        stringHelper.stringTransformation("", new char[]{'S', 'u', 'p', 'e', 'r', 'X', 'X'});

        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println();

        System.out.println("Задания по регулярным выражениям");

        System.out.println();

        RegExHelper regExHelper = new RegExHelper();

        regExHelper.checkString("+38(093)1111111");

        regExHelper.checkString("alex@gmail.com");

        regExHelper.checkString("01.01.2001");

        regExHelper.checkString("Some String");

    }

}
