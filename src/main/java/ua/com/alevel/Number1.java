package ua.com.alevel;

import java.io.File;
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        String defaultPath = "src/main/resources/";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите абсолютный " +
                "путь к файлу или имя файла, " +
                "тогда мы будем искать здесь - " +
                "\"src/main/resources/*nameOfFile*\" ");
        String path = scanner.nextLine();
        File file = new File(path);
        File fileWithDefaultPath = new File(defaultPath + path);
        if (file.exists() && file.isFile()) {
            System.out.println("Файл найден! Продолжаем работу.");
        } else if (fileWithDefaultPath.exists() && fileWithDefaultPath.isFile()) {
            System.out.println("Файл найден! Продолжаем работу.");
        } else {
            System.out.println("Файл не найден. Попробуйте снова позже.");
        }
    }
}
