package oop.interfaces;

import oop.interfaces.print.Book;
import oop.interfaces.print.Journal;
import oop.interfaces.print.Printable;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Name", "Author");
        book.defaultPrint();
        book.defaultPrintPrivatePrefix();
        book.print();

        Journal journal = new Journal("Elle");
        journal.print();
        journal.defaultPrint();

        Printable.read();

        Printable printable = createPrintable("Foreign Affairs", true);
        printable.print();

        read(new Book("Java for inpatients", "Cay Horstmann"));
        read(new Journal("Java Daily News"));

        Printable bookP = new Book("Java for impatients", "Cay Horstmann");
        Printable journalP = new Journal("Java Daily News");

        bookP.print();
        journalP.print();

        Printable[] printables = new Printable[2];
        printables[0] = bookP;
        printables[1] = journalP;

        System.out.println("---------------");
        for (Printable prnt : printables) {
            prnt.print();
            prnt.defaultPrint();
        }
    }

    static void read(Printable printable) {
        printable.print();
    }

    static Printable createPrintable(String name, boolean option) {
        if (option) {
            return new Book(name, "Undefined");
        } else {
            return new Journal(name);
        }
    }
}