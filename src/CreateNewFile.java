

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    //В этом классе представлены способы создания файла в Java
    public static void main(String[] args) throws IOException {
        // получаем разделитель пути в текущей операционной системе
        String fileSeparator = System.getProperty("file.separator");

        //создаем абсолютный путь к файлу
        String absoluteFilePath = fileSeparator + "Users" + fileSeparator + "prologistic" + fileSeparator + "file.txt";

        File file = new File(absoluteFilePath);
        if (file.createNewFile()) {
            System.out.println(absoluteFilePath + " Файл создан");
        } else {
            System.out.println("Файл " + absoluteFilePath + " уже существует");


            //создаем файл с указанием относительного пути к файлу
            String relativePath = "tmp" + fileSeparator + "file.txt";
            file = new File(relativePath);
            if (file.createNewFile()) {
                System.out.println(relativePath + " файл создан в корневой директории проекта");
            } else System.out.println("Файл " + relativePath + " уже существует в директории проекта");
        }

    }
}