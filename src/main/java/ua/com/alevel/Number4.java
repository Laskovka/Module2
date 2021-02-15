package ua.com.alevel;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        String defaultPath = "src/main/resources/";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите путь к дирректории, в " +
                "которой вы хотите увидеть все .txt файлы, " +
                "либо оставьте строку пустой и мы покажем " +
                "все .txt файлы по стандартному пути - " +
                "\"src/main/resources/\"");
        String path = scanner.nextLine();
        File directory = new File(path);
        File defaultDirectory = new File(defaultPath);
        if (path.equals("")) {
            methodForFourTask(defaultDirectory);
        } else if (directory.isDirectory()) {
            methodForFourTask(directory);
        } else {
            System.out.println("Вы ввели не дирректорию.");
        }
    }

    public static void methodForFourTask(File directory) {
        List<File> allFilesInDirectory = new ArrayList<>(Arrays.asList(directory.listFiles()));
        List<String> txtFiles = new ArrayList<>();
        for (int i = 0; i < allFilesInDirectory.size(); i++) {
            String path = allFilesInDirectory.get(i).getName();
            path = path.substring(path.length() - 4);
            if (path.equals(".txt")) {
                txtFiles.add(allFilesInDirectory.get(i).getName());
            }
        }
        for (String list :
                txtFiles) {
            System.out.println(list);
        }
    }

    ;
}
