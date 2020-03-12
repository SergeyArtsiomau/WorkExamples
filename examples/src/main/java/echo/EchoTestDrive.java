package echo;

public class EchoTestDrive {

  public static void main(String[] args) {
    Echo e1 = new Echo();
    int x = 0;
    while (x < 4) {

      e1.hello();
      e1.count = e1.count + 1;
      if (x ==3) {
        e1.count = e1.count + 1;
      }

      if (x > 0) {
        e1.count = e1.count + e1.count;
      }
      x = x + 1;
    }
    System.out.println(e1.count);

  }

}
