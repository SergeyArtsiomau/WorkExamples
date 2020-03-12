public class Test {

  public static void main(String[] args) {
    one();
    two();
    three();
    four();
    five();
  }

  private static void one() {
    int x = 0;
    int y = 0;
    while (x < 5) {

      y = x - y;
      System.out.print(x + "" + y + " ");

      x = x + 1;
    }
  }


  public static void two() {
    int x = 0;
    int y = 0;
    while (x < 5) {

      y = x + y;
      System.out.print(x + "" + y + " ");

      x = x + 1;
    }
  }

  public static void three() {
    int x = 0;
    int y = 0;
    while (x < 5) {

      y = y + 2;
      if (y > 4) {
        y = y - 1;
      }
      System.out.print(x + "" + y + " ");

      x = x + 1;
    }
  }

  public static void four() {
    int x = 0;
    int y = 0;
    while (x < 5) {

      x = x + 1;
      y = y + x;
      System.out.print(x + "" + y + " ");

      x = x + 1;
    }
  }

  public static void five() {
    int x = 0;
    int y = 0;
    while (x < 5) {

      if (y < 5) {
        x = x + 1;
        if (y < 3) {
          x = x - 1;
        }
      }
      y = y + 2;
      System.out.print(x + "" + y + " ");

      x = x + 1;
    }
  }

}
