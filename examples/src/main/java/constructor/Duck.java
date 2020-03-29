package constructor;

public class Duck extends Animal {

  int size;

//  public Duck(int ducksize) {
//    System.out.println("Кря");
//    size = ducksize;
//    System.out.println("Размер равен = " + size);
//  }

  public Duck(int newSize) {
    super("Кряква");
//    if (newSize == 0) {
//      size = 27;
//    } else {
    size = newSize;
//    }
  }


  public void setSize(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }
}
