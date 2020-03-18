package Battleship;

public class SimpleDotComGame {

  public static void main(String[] args) {
    int numOfGuess = 0;
    GameHelper helper = new GameHelper();

    SimpleDotCom dotCom = new SimpleDotCom();
    int random = (int) (Math.random() * 5);

    int[] location = {random, random + 1, random + 2};
    dotCom.setLocationCells(location);
    boolean isAlive = true;

    while (isAlive = true) {
      String guess = helper.getUserInput("Введите число");
      String result = dotCom.checkYouself(guess);
      numOfGuess++;
      if (result.equals("Потопил")) {
        isAlive = false;
        System.out.println("Вам потребовалось" + numOfGuess + "попыток(и)");
      }

    }
  }
}
