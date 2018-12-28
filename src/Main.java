
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";//создание строки
        String blankString = "заменилстроку";
        String blankWord = "заменилслово";
        List<String> lines = new ArrayList<>();

        System.out.println("Для выхода введите 'q' и нажмите 'Enter'");

        while (!"q".equals(s)) {//пока не нажата клавиша выхода
            System.out.print("Введите строку: ");
            s = scanner.nextLine();//чтение строки
            lines.add(s);//возвращение строки
        }
        lines.remove("q");//при нажатии q

        lines.set(1, blankString);
        String[] words = lines.get(2).split(" "); //разбить строку для замены
        if (words.length > 1) words[1] = blankWord;
        lines.set(2, String.join(" ", words));//замена слова

        try (FileWriter writer = new FileWriter(new File("F:/test.txt"))) {
            for (String line : lines) {
                writer.write(line + System.lineSeparator());//замена строки
            }
            writer.flush();//закрыть запись
        } catch (IOException e) {
            e.printStackTrace();//отслеживание исключения программой
        }
    }
}
