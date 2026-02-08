package ru.hse.lab1;

import ru.hse.lab1.second.Person;

/**
 * @author — Пигин Павел Игоревич
 * @version — 1.0
 * @since — 2026
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Pavel", 18);

        System.out.println("Имя: " + person.name + "\nВозраст: " + person.age);
    }
}
