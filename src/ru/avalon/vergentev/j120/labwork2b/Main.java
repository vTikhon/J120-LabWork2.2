package ru.avalon.vergentev.j120.labwork2b;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>ЗАДАНИЕ 2<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        Scanner inputFileName = new Scanner(System.in);
        System.out.println("Enter the URL of the file (Task2):");
        String url = inputFileName.nextLine();
        TextChecker textChecker = new TextChecker(new File(url));
        textChecker.getReports();
    }
}
