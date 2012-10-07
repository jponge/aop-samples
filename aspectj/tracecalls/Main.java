public class Main {

  public int fact(int n) {
    int result = n;
    for (int i = 0; i < n; i++) {
      result = n * n;
    }
    return result;
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("fact(" + i + ") = " + fact(i));
    }
  }
  
  public static void main(String... agrs) {
    new Main().run();
  }
}