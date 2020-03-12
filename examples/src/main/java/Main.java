public class Main {

  public static void main(String[] args) {
    int x = 3;
    String name = "Кинжал";
    x = x * 17;
    double d = Math.random();
    //this is comment

    while (x > 12) {
      x = x - 1;
    }

    for (x = 0; x < 10; x++) {
      System.out.println("Теперь х равен " + x);
    }

    if (x == 10) {
      System.out.println("х должен быть равен 10");
    } else {
      System.out.println("х не равен 10");

    }

    if ((x < 3) & (name.equals("Кинжал"))) {
      System.out.println("Осторожно");
    }
    System.out.println("Эта строка выполняется в любом случае");

    miniExample();
  }

  static void miniExample() {

    int x = 4;
    while (x > 3) {
      x = x - 1;
    }

    int z = 27;
    while (z == 17) {
      // Код цикла не будет запущен, так как z != 17
    }
  }
}
