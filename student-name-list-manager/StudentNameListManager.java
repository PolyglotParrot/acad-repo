package com.mycompany.days.of.java;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentNameListManager {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        
        System.out.print("Number of students you want to enter: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter student #" + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }
        
        System.out.println("List of Students Entered: ");
        for (String name : names){
            System.out.println(name);
        }
        
        boolean isRunning = true;
        
        while (isRunning) {
            
            System.out.println("1. Search a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                
                case 1 -> {
                    System.out.println("Enter the name of the student you want to search:");
                    System.out.print("Name: ");
                    String searchName = scanner.nextLine();
                    if (names.contains(searchName)) {
                        System.out.println("Student found.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                }
                
                case 2 -> {
                    System.out.println("Enter the name of the student you want to remove:");
                    System.out.print("Name: ");
                    String deleteName = scanner.nextLine();
                    if (names.contains(deleteName)) {
                        names.remove(deleteName);
                        System.out.println("Student successfully deleted.");
                    } else {
                        System.out.println("Student named " + deleteName + " was not found.");
                    }
                    break;
                }
                
                case 3 -> {
                    System.out.println("Thank you for using the system.");
                    isRunning = false;
                    break;
                }
                
                default -> {
                    System.out.println("Please enter a valid choice.");
                    break;
                }

            }
            
        }
        
        System.out.println("Updated List: ");
        for (String name : names){
            System.out.println(name);
        }
    }
}
