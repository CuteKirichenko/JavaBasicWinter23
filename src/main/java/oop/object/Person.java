package oop.object;

import oop.classes.simple.Animal;

import java.util.Objects;

//Расширила Животных Человеком, чтобы использовать метод родителя по примеру getClass()
public class Person extends Animal {
    public int age;
    public String name;
    public boolean isMarried;

    //Можем использоваать любые методы (соглассно модификаторам доступа) родителя в ребенке
    public void printCurrentClass() {
        //Например, getClass()
        System.out.println(this.getClass().getName());
        //или sound()
        System.out.println(sound());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        //метод getClass() есть в родителе классса Person, мы просто его вызвали как любо другой
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && isMarried == person.isMarried && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, isMarried);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }

    public class Education {
        int years;
        String university;
    }

    public class Experience {
        int years;
        String work;
    }
}
