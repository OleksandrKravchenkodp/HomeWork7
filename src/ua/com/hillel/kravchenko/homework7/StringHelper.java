package src.ua.com.hillel.kravchenko.homework7;


public class StringHelper {

    String string;
    char[] chars;

    public StringHelper() {

    }

    public StringHelper(String string, char[] chars) {
        this.string = string;
        this.chars = chars;
    }

    String stringTransformation(String string, char[] chars) {
        if (chars == null) {
            System.out.println("The character array is null");

            return null;
        }

        //String newString = chars.toString();
        String newString = String.valueOf(chars);

        boolean flagStr1 = string.trim().isEmpty(); //пробелы обрезал с помощью метода trim()
        //т.к. по статистике у многих стоит еще 8 Java и что бы просто машинно потренировать использование методов
        //которые поддерживают разные JDK, далее в прогремме использую метод strip();

        boolean flagStr2 = newString.isBlank();//тут просто для практики строку проверил в две строчки и две команды
        boolean flagStr3 = newString.isEmpty();//сначала на то состоит ли она полностью из пробелов/табуляций, потом на пустоту.


        if (flagStr1 == true || flagStr2 == true || flagStr3 == true) {
            System.out.println("One of the lines is empty");

            return null;
        }

        string = string.toUpperCase();
        newString = newString.toLowerCase();

        string = string.strip();
        newString = newString.strip();

        String concatString = string.concat(" ").concat(newString);

        String resultString = "";


        if (concatString.length() % 2 == 0) {

            char char1 = concatString.charAt(concatString.length() / 2 - 1);
            resultString = String.valueOf(char1);

            char char2 = concatString.charAt(concatString.length() / 2);
            resultString = resultString + String.valueOf(char2);

        } else {
            char char3 = concatString.charAt(concatString.length() / 2);

            resultString = String.valueOf(char3);
        }

        System.out.println("Result string is: " + resultString);
        return resultString;
    }
}