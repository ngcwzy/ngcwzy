package org.example;

public class Attendee {
    private String name;
    private char gender;
    private int age;

    private String email;
    public Attendee(String name,char gender,int age,String email){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }
    public String getName(){

        return name;
    }
    public char getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setName(String name){

        this.name = name;
    }
    public String toString() {
        return "Attendee{Name='"+name+"',Email='"+email+"'}";

    }


}