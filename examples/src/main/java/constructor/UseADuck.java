package constructor;

public class UseADuck {

  public static void main(String[] args) {
    Duck d = new Duck(0);
    //d.setSize(42);
    int size = d.getSize();
    System.out.println(size);

    Duck2 d2 = new Duck2(15);
    Duck2 duck2 = new Duck2();

  }
}

