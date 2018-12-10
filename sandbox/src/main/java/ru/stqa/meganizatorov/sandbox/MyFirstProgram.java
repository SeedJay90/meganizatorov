package ru.stqa.meganizatorov.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    System.out.println("Hello, world!");

    System.out.println(2 + 2); //сумма
    System.out.println(2 * 2); //умножение
    System.out.println(2 / 2); //деление
    System.out.println(2 - 2); //вычитание
    System.out.println(1 / 2); //результат 0 потому что идет округление 0.5 до целого числа
    System.out.println(1.0 / 2); //результат 0.5 потому что мы явно указываем что результат будет с плав.точкой
    System.out.println(1 / 2.0); //тоже самое что и выше
    System.out.println(2.0 / 2); //тоже самое
    System.out.println("2" + "2"); //конкатенация/склеивание строк
    System.out.println("2" + 2); //склеивание, преобразовние числа в строку
    System.out.println(2 + "2"); //склеивание, преобразовние числа в строку
  }

}