package constructor;

public class TestDuck {

  public static void main(String[] args) {

    int weight = 8;
    float density = 2.3F;
    String name = "Дональд";
    long[] feathers = {1, 2, 3, 4, 5, 6};
    boolean canFly = true;
    int airspeed = 22;
    NewDuck[] d = new NewDuck[7];
    d[0] = new NewDuck();
    d[1] = new NewDuck(density,weight);
    d[2] = new NewDuck(name,feathers);
    d[3] = new NewDuck(canFly);
    d[4] = new NewDuck(3.3F, airspeed);
    d[5] = new NewDuck(false);
    d[6] = new NewDuck(airspeed,density);

  }
}
