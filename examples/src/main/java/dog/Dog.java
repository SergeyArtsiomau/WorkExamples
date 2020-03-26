package dog;

import polymorphism.Animal;

public class Dog extends Animal {

  int size;
  String breed;
  String name;

  void bark() {

    if (size > 60) {
      System.out.println("Гав! Гав");
    } else if (size > 14) {
      System.out.println("Вуф! Вуф");
    } else {
      System.out.println("Тяф! Тяф");
    }
  }

  void bark(int numOfBarks){
    while(numOfBarks>0){
      System.out.println("Гаф");
      numOfBarks--;
    }
  }

  public void makeNoise(){

  }

  public void eat(){

  }
}
