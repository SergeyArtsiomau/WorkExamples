package GeekBrains;

import java.util.Scanner;

public class GuessTheNumber {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Ваша задача угадать число: ");
    for (int i = 10; i <= 30; i += 10) {
      playLevel(i);
    }
    System.out.println("Вы выиграли!!!");
    scanner.close();
  }

  private static void playLevel(int range) {
    int number = (int) (Math.random() * range);

    while (true) {
      System.out.println("Угадайте число от 0 до " + range);
      int inputNumber = scanner.nextInt();
      if (number == inputNumber) {
        System.out.println("Вы угадали число!!!");
        break;
      } else if (inputNumber > number) {
        System.out.println("Загаданное число меньше");
      } else {
        System.out.println("Загаданное число больше");
      }
    }
  }
}
