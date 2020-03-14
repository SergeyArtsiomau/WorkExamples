public class HeapQuiz {

  int id = 0;

  public static void main(String[] args) {
    HeapQuiz[] hq = new HeapQuiz[5];
    for (int x = 0; x < 3; x++) {
      hq[x] = new HeapQuiz();
      hq[x].id = x;
      System.out.println();
    }
    hq[3] = hq[1];
    hq[4] = hq[1];
    hq[3] = null;
    hq[4] = hq[0];
    hq[0] = hq[3];
    hq[3] = hq[2];
    hq[2] = hq[0];
    for (HeapQuiz h: hq)
      System.out.println(h);
  }
}
