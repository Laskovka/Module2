package ua.com.alevel;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        String defaultPath = "src/main/resources/";
        Scanner scanner = new Scanner(System.in);
        List<String> files = new ArrayList<>();
        String path = "";
        int mixSizeOfFile = 0;
        int maxSizeOfFile = 0;
        System.out.println("Введите \"1\", " +
                "если хотите найти файлы в \"" + defaultPath + "\". " +
                "Или 2, если хотите найти файлы в своём пути.");
        while (scanner.hasNextLine()) {
            path = scanner.nextLine();
            if (path.equals("1")) {
                System.out.println("Пожалуйста введите " +
                        "через строчку диапазон размера файла, " +
                        "где первое число " +
                        "- минимальный размер файла," +
                        "а второе число(через строчку) - максимальный размер файла, " +
                        "в байтах.");
                File defaultDirectory = new File(defaultPath);
                mixSizeOfFile = scanner.nextInt();
                maxSizeOfFile = scanner.nextInt();
                methodForSixTask(defaultDirectory, mixSizeOfFile, maxSizeOfFile);
                break;
            } else if (path.equals("2")) {
                System.out.println("Пожалуйста введите " +
                        "через строчку путь файла и " +
                        "диапазон размера файла, " +
                        "где первое число " +
                        "- минимальный размер файла," +
                        "а второе число(через строчку) - максимальный размер файла, " +
                        "в байтах.");
                path = scanner.nextLine();
                mixSizeOfFile = scanner.nextInt();
                maxSizeOfFile = scanner.nextInt();
                File directory = new File(path);
                if(directory.isDirectory()) {
                    System.out.println("ДИРРЕКТОРИЯ!");
                    methodForSixTask(directory, mixSizeOfFile, maxSizeOfFile);
                }
                break;
            }
        }
    }

    public static void methodForSixTask(File directory, int mixSize, int maxSize) {
        List<File> allFilesInDirectory = new ArrayList<>(Arrays.asList(directory.listFiles()));
        List<String> filesWithSize = new ArrayList<>();
        for (int i = 0; i < allFilesInDirectory.size(); i++) {
            if (allFilesInDirectory.get(i).length() >= mixSize &&
                    allFilesInDirectory.get(i).length() <= maxSize) {
                filesWithSize.add(allFilesInDirectory.get(i).getName());
            }
        }
        for (int i = 0; i < filesWithSize.size(); i++) {
            System.out.println(filesWithSize.get(i));
        }
    }
}
