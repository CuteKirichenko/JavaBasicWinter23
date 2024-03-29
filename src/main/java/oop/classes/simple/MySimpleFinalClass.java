package oop.classes.simple;

/**
 * Финальный класс
 */
public final class MySimpleFinalClass {

    //Финальная переменная
    public final int one = 1;

    //Пробуем присвоить другое значение финальной переменной
    public void wrongWorkWithFinalVariable() {
        //one = 2;
    }

    //Пробуем переопределить финальный метод - сделаем класс не финальным и пробуем в MySimpleClass
    public final void myFinalMethod() {
        System.out.println("overridden method is final");
    }

}
