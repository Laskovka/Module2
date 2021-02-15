package ua.com.alevel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        String defaultPath = "src/main/resources/";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите путь к дирректории, " +
                "которая вам нужна. Или оставьте строку пустой, тогда " +
                "мы покажем стандартную дирректорию - " +
                "\"src/main/resources/\"");
        String path = scanner.nextLine();
        File directory = new File(path);
        File defaultDirectory = new File(defaultPath);
        if (path.equals("") && defaultDirectory.isDirectory()) {
            System.out.println(defaultDirectory.getName() + " - дирректория.");
        } else if(directory.exists() && directory.isDirectory()) {
            System.out.println(directory.getName() + " - дирректория.");
        } else {
            System.out.println("Вы ввели не дирректорию.");
        }
    }
}
