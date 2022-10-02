package src.ua.com.hillel.kravchenko.homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExHelper {
    /*
    3. Создать класс-помощник, внутри которого реализовать 3 метода для проверки,
    являтся ли строковае поле нужным значением:

            3.1. Номер телефона(Украинский формат);

3.2. Почта;

3.3. Дата рождения

4. В Main также вызвать для проверки*/

    String string;

    public RegExHelper() {
    }

    public RegExHelper(String string) {
        this.string = string;
    }

    void checkString(String string) {

        boolean number = string.matches("(^)+");
        //По номеру телефона поддерживаем формат +38(093)1111111
        Pattern patternNumber = Pattern.compile("^(\\+\\d{2}\\(\\d{3}\\)\\d{7}$)", Pattern.CASE_INSENSITIVE);
        Matcher matherNumber = patternNumber.matcher(string);
        boolean findNumber = matherNumber.find();

        //По почте я не делаю ограничение по регистру букв (поскольку если потом нужна будет дальнейшая обработка
        //можно будет воспользоваться .equalsIgnoreCase();
        //также в регулярке делаю определенное ограниение на кол-во символов доменных зон и имени в почте
        //что бы почта вводилась читаемая
        Pattern patternMail = Pattern.compile("^(\\w+\\@\\w+\\.\\w{1,5}$)", Pattern.CASE_INSENSITIVE);
        Matcher matherMail = patternMail.matcher(string);
        boolean findMail = matherMail.find();

        //По дате рождения думаю формат понятен :)
        Pattern patternDateOfBirth = Pattern.compile("^(\\d{2}\\.\\d{2}\\.\\d{4}$)", Pattern.CASE_INSENSITIVE);
        Matcher matherDateOfBirth = patternDateOfBirth.matcher(string);
        boolean findDateOfBirth = matherDateOfBirth.find();


        if (findNumber == true) {
            System.out.println("The string you entered is a phone number. Also the string is not an email or date of birth.");
        } else if (findMail == true) {
            System.out.println("The string entered is an email. Also, the string is not a phone number or date of birth.");
        } else if (findDateOfBirth == true) {
            System.out.println("The string entered is the date of birth. The string is also not a phone number or email.");
        } else {
            System.out.println("The entered string does not match the conditions of the task.");
        }
    }

}
