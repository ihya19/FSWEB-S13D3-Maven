package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    double weight;
    String birthplace;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    public Person(String firstName, String lastName, int age,String birthplace){
        this(firstName,lastName,age);
        this.birthplace = birthplace;

    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
