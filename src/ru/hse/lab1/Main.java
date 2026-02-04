package ru.hse.lab1;

import ru.hse.lab1.second.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Pavel", 18);

        System.out.println("Имя: " + person.name + "\nВозраст: " + person.age);
    }
}
