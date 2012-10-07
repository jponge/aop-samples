public class HelloWorld {
  
  public static void print(String str) {
    System.out.println(">>> " + str);
  }
  
  public static void main(String... args) throws Throwable {
    int i = 0;
    while (true) {
      print("i = " + i);
      i = i + 1;
      Thread.sleep(2000);
    }
  }
}