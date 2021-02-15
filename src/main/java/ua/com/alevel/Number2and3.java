package ua.com.alevel;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Number2and3 {
    public static void main(String[] args) {
        String defaultPath = "src/main/resources/";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите пути к файлам, " +
                "которые вам нужны через строчку, " +
                "завершив ввод - введите \"q\". " +
                "Иначе - мы будем искать файлы тут - " +
                "\"src/main/resources/\"");
        List<String> files = new ArrayList<>();
        String path = "";
        while (scanner.hasNextLine()) {
            path = scanner.nextLine();
            File file = new File(path);
            File fileWithDefaultPath = new File(defaultPath + path);
            if(path.equals("q")) {
                break;
            } else if (file.exists() && file.isFile()) {
                files.add(path);
                System.out.println("Файл найден. Продолжаем работу.");
            } else if (fileWithDefaultPath.exists() && fileWithDefaultPath.isFile()) {
                files.add(fileWithDefaultPath.getAbsolutePath());
                System.out.println("Файл найден! Продолжаем работу.");
            } else {
                System.out.println("Файл не найден.");
            }
        }
        for (int i = 0; i < files.size(); i++) {
            System.out.println(files.get(i));
        }
    }
}
