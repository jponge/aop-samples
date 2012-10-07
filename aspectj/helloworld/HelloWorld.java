public class HelloWorld {
  
  public void run(String... args) {
    System.out.println("Hello, world!");
  }
  
  public static void main(String... args) {
    new HelloWorld().run(args);
  }
}