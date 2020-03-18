package Battleship;

public class SimpleDotComTestDrive {

  public static void main(String[] args) {
    SimpleDotCom simpleDotCom = new SimpleDotCom();
    int[] location = {2, 3, 4};
    simpleDotCom.setLocationCells(location);
    String str = "2";
    String result = simpleDotCom.checkYouself(str);
  }
}
