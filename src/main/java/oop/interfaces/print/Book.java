package oop.interfaces.print;

public class Book implements Printable, Searchable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println(name + " (" + author + ")");
    }

    @Override
    public void defaultPrint() {
        System.out.println("I am not default print!");
    }

    int sum(int one, int two) {
        return one + two;
    }

    int sum(int one, int two, int three) {
        return one + two + three;
    }

}
