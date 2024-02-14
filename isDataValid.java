import java.text.ParseException;
import java.text.SimpleDateFormat;

public class isDataValid {

    public static void isCountofDataValid(String[] string) {
        if (string.length > 6)
            throw new RuntimeException("Данных больше, чем требуется!");
        if (string.length < 6)
            throw new RuntimeException("Данных меньше, чем требуется!");
    }

    public static String validFullName(String string) {
        if (string.matches("[\\d]"))
            throw new RuntimeException("Ошибка в ФИО!");
        return string;
    }

    public static String validDate(String string) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.parse(string);
        return string;
    }

    public static int validNumber(String string) {
        return Integer.parseInt(string);
    }

    public static char validSex (String string) {
        if (!(string.equals("f") || string.equals("m"))) throw new RuntimeException("Неверно указан пол!");
        char sex = string.charAt(0);
        return sex;
    }
}

