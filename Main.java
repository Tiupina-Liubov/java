public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        System.out.println("В методе main создать переменные всех примитивных типов и вывести их значения в консоль:");
        System.out.println("Переменные");
        int a1;
        a1 = 89;
        byte a2;
        a2 = 4;
        char a3;
        a3 = 'G';
        short a4;
        a4 = 56;
        float a5;
        a5 = 4.7333436f;
        double a6;
        a6 = 4.355453532;
        long a7;
        a7 = 1212111;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Задание №2");
        System.out.println("Дано трехзначное число. Вывести на экран все цифры этого числа.Пример : 345. Вывод в консоль: Число 345 -> 3, 4, 5");
        System.out.println();
        int num = 345;
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println(num + "->" + a + "," + b + "," + c);
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Дополнительная практика");
        System.out.println("1");//"1. Провести исследование: задать переменной максимальное значение для её типа. Вывести значение переменной на экран. Затем добавить 1 к значению переменной и снова вывести значение переменной на экран. Какой результат Вы получили?"//
        System.out.println();
        byte myByte = 127;/**/
        short myShort = 32767;
        myByte = (byte) (myByte + 1);/* (myByte = myByte +1;) Если прописывать так, то показывает ошибку или предлагает поменять тип переменой.  */
        System.out.println(myByte);
        myShort = (short) (myShort + 1);
        System.out.println(myShort);
        int myInt = 2147483647;
        System.out.println(myInt);
        long myLong = 1234567890L;
        System.out.println(myLong);
        float myFloat = 123.45f;
        System.out.println(myFloat);
        double myDouble = 123.456;
        System.out.println(myDouble);
        char myChar = 'c';
        myChar = (char) (myChar + 1);
        System.out.println(myChar);/*Когда к этому типу переменной добавляет ся 1 то просто показываться следующая буква в алфавитном порядке.*/
        boolean myBoolean = true;
        boolean myBoolean1 = false;
        System.out.println(myBoolean);
        System.out.println(myBoolean1);
        System.out.println("---------------------");
        System.out.println("2");/* Провести исследование: вывести на экран произведение переменной целого типа и переменной дробного типа. Какой тип получился в результате? Попробуйте поместить результат в переменную.*/
        int number1 = 25;
        System.out.println(number1);
        double number2 = 11.67;
        System.out.println(number2);
        double number3 = (number1 + number2);
        System.out.println(number3);
        System.out.println("----------------------");
        System.out.println("3");/* Провести исследование: вывести на экран произведение переменной целого типа и переменной дробного типа. Какой тип получился в результате? Попробуйте поместить результат в переменную.*/
        char letter1 = 'A';
        System.out.println(letter1);
        letter1 = (char) (letter1 + 1);
        System.out.println(letter1);
        System.out.println();


    }
}