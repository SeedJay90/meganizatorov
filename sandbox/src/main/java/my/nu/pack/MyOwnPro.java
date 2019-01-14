package my.nu.pack;

public class MyOwnPro {

  public static void main(String[] args) {
    SumTwoNumbers s = new SumTwoNumbers(4, 5);

    System.out.println("Сумма двух чисел " + s.a + " и " + s.b + " равна " + s.sum());
    test("Привет");
    System.out.println(multiply(4));
  }

  public static void test(String text){
    System.out.println("Это то что ты ввел: " + text);
  }

  public static int multiply(int a){
    return a * a;
  }
}
