import java.util.Scanner;

public class Info {

    String [] data;

    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Введите данные через пробел:\nФамилия Имя Отчество дата_рождения номер_телефона пол\n\nФорматы данных:\nфамилия, имя, отчество - строки\nдата_рождения - строка формата dd.mm.yyyy\nномер_телефона - цифры\nпол - символ латиницей f или m");
        String string = scanner.nextLine();
        scanner.close();
        string = string.trim().replaceAll(" +", " ");
        this.data = string.split(" ");
    }

    public String[] getData () {
        return this.data;
    }
}
