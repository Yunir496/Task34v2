package org.example;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к исходной папке");
        String a = scanner.nextLine();
        System.out.println("Введите путь к папке назначения");
        String b = scanner.nextLine();
        copyFolder(a,b);
    }
    public static void copyFolder(String a,String b){
        File aa = new File(a);
        File bb = new File(b);
        try{
            if(!aa.exists() || !aa.isDirectory()){
                System.out.println("Ошибка, путь не существует или не является папкой");
                return;
            }
            if(!bb.exists()){
                bb.mkdirs();
            }
            FileUtils.copyDirectory(aa,bb);
            System.out.println("Папка успешно скопирована");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании папки: "+e.getMessage());
        }
    }
}
