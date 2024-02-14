import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Info info = new Info();
        info.setData();
        isDataValid.isCountofDataValid(info.getData());
        try {
            Person person = new Person(info.getData());
            makeNote(person);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты рождения!");
        } catch (NumberFormatException e) {
            System.out.println("Неверно введен номер телефона!");
        }
    }

    public static void makeNote(Person person) {
        File file = new File(person.getSurame() + ".txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Файл не создан!");
                e.printStackTrace();
            }
        }

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(person.toString()+"\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("Запись не создана!");
            e.printStackTrace();
        }
    }
}