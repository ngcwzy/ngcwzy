package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.*;
import java.util.Set;

public class Event {
    Scanner scanner = new Scanner(System.in);
    private String eventID;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    ArrayList<Attendee> eventAttendees = new ArrayList<>();

    public Event(){
    }



    public void setEventID(String id) {

        eventID = id;
    }
    public String getEventID() {

        return eventID;
    }

    public void setEventName(String name) {

        eventName = name;
    }
    public String getEventName() {

        return eventName;
    }




    public void setEventVenue(String Venue) {

        eventVenue = Venue;
    }
    public String getEventVenue() {

        return eventVenue;
    }



    public void setEventDate(LocalDate date) {

        eventDate = date;
    }
    public LocalDate getEventDate() {

        return eventDate;
    }
    public void organizedEvent(int choice){
            switch (choice) {
                case 1:
                    System.out.println("Enter event id ");
                    String id = scanner.nextLine();
                    setEventID(id);

                    System.out.println("Enter event Name: ");
                    String eventname = scanner.nextLine();
                    setEventName(eventname);
                    System.out.println("enter the event date");
                    LocalDate date =LocalDate.now();
                    setEventDate(date);
                    System.out.println("enter the event  venue");
                    String venue = scanner.nextLine();
                    setEventVenue(venue);
                    System.out.println(new StringBuilder().append("Event ID: ").append(eventID).append("\nEvent Name: ").append(eventName).append("\nEvent Venue: ").append(eventVenue).append("\nEvent Date: ").append(eventDate).toString());

                case 2:
                    System.out.println("How many attendees are coming:");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    for(int i=0;i<num;i++){
                        System.out.println("Enter the name of the attendee");
                        String name = scanner.nextLine();

                        System.out.println("Enter the gender of the attendee");
                        char gender = scanner.nextLine().charAt(0);
                        System.out.println("Enter the age of the attendee");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Enter the email of the attendee");
                        String email = scanner.nextLine();
                        eventAttendees.add(new Attendee(name,gender,age,email));}
                    case 3:
                            System.out.print("Enter Attendee Name: ");
                            String removeName = scanner.nextLine();
                            removeAttendee(removeName);
                case 4:
                    System.out.print("Enter Old Attendee Name: ");
                    String oldName = scanner.nextLine();
                    System.out.print("Enter New Attendee Name: ");
                    String newName = scanner.nextLine();
                    String app= updateAttendee(oldName, newName);
                    System.out.print(app);
                case 5:
                    System.out.print("Enter Attendee Name: ");
                    String findName = scanner.nextLine();
                    System.out.println(findAttendee(findName));
                case 6:
                    System.out.println("Attendee List:");
                    for (Attendee attendee : eventAttendees) {
                        System.out.println("Name: " + attendee.getName());
                        System.out.println("Gender: " + attendee.getGender());
                        System.out.println("Age: " + attendee.getAge());
                        System.out.println("Email: " + attendee.getEmail());
                        System.out.println("---------------------------");
                    }
                    break;

                    }
                    }





    public void removeAttendee(String attendeeName) {

        eventAttendees.remove(attendeeName);
    }

    public String updateAttendee(String oldName, String newName) {
        for (Attendee attendee : eventAttendees) {
            if (attendee.getName().equals(oldName)) {
                attendee.setName(newName);
                return newName;
            }
        }
        return "Cannot find the attendee with the old name.";
    }

    public String findAttendee(String attendeeName) {
        if (eventAttendees.contains(attendeeName)) {
            return attendeeName;
        } else {
            return "Attendee not found.";
        }
    }



    @Override
    public String toString() {
        return "Event ID: " + eventID +
                "\nEvent Name: " + eventName +
                "\nEvent Venue: " + eventVenue +
                "\nEvent Date: " + eventDate +
                "\nEvent Attendees: " + eventAttendees.toString();
    }
//    public void  organizeEvent(int choice){
//        for(int i=0;)

}

