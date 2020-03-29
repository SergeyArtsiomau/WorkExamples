package constructor;

public class NewDuck {

  int pound = 6;
  float flotability = 2.1F;
  String name = "Универсальная";
  long[] feathers = {1, 2, 3, 4, 5, 6, 7};
  boolean canFly = true;
  int maxSpeed = 22;


  public NewDuck() {
    System.out.println("Утка типа 1");
  }

  public NewDuck(boolean fly) {
    canFly = fly;
    System.out.println("Утка типа 2");
  }

  public NewDuck(String n, long[] f) {
    name = n;
    feathers = f;
    System.out.println("Утка типа 3");
  }

  public NewDuck(int w, float f) {
    pound = w;
    flotability = f;
    System.out.println("Утка типа 4");
  }

  public NewDuck(float density, int max) {
    density = flotability;
    maxSpeed = max;
    System.out.println("Утка типа 5");
  }
}
