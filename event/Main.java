package org.example;

import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击间距中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Event event = new Event();



    int choice ;
    do {
        System.out.println("\n--- Event Organizer Menu ---");
        System.out.println("1. Display Event Details");
        System.out.println("2. enter Attendee name");
        System.out.println("3. remove Attendee");
        System.out.println("4. update Attendee");
        System.out.println("5. find Attendee");
        System.out.println("6. display all the attendees from the event");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        event.organizedEvent(choice);
    }while (choice !=7);
    scanner.close();
}
}





