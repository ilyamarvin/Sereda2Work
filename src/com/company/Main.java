package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shape form = new Shape();
        form.toString();
        Scanner scan = new Scanner(System.in);
        Dog dogge = new Dog(1, "a");
        dogge.toString();
        dogge.RecoderAge();
    }
}

class Shape {
    int width = 10, height = 15;
    String name = "Form";

    @Override
    public String toString() {
        System.out.println("Shape{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}');
        return "";
    }
}

class Ball {}

class Book {}

class Dog {
    int age, ReAge;
    String name;

    public Dog(int age, String name) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter dogge age and name: ");
        this.age = scan.nextInt();
        this.name = scan.nextLine();
    }

    int RecoderAge() {
        ReAge = age*7;
        System.out.println("Dogge age in human age: "+ ReAge);
        return age;
    }

    @Override
    public String toString() {
        System.out.println("Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}');
        return "";
    }
}
