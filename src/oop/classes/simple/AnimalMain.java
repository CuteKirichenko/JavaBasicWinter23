package oop.classes.simple;

public class AnimalMain {
    public static void main(String[] args) {
        Animal barsik = new Cat();
        barsik.name = "Barsik";
        barsik.place = "hole world";
        System.out.println(barsik.sound());

        Animal star = new Horse();
        star.name = "Star";
        star.place = "Asia";
        System.out.println(star.sound());

        Animal[] animals = new Animal[2];
        animals[0] = barsik;
        animals[1] = star;

        for (Animal animal : animals) {
            System.out.println(animal.sound());
        }
    }
}
