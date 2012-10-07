public class Fibo {
  
  public long fibo(long n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be >= 0");
    } else if (n <= 1) {
      return n;
    } else {
      return fibo(n - 1) + fibo(n - 2);
    }
  }
  
  public void run() {
    for (int i = 0; i < 60; i++) {
      System.out.println("fibo(" + i + ") = " + fibo(i));
    }
  }
  
  public static void main(String... args) {
    new Fibo().run();
  }
}