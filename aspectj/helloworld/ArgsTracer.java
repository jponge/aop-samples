import org.aspectj.lang.annotation.*;

@Aspect
public class ArgsTracer {
  
  @Before("target(hello) && call(void run(String...)) && args(params)")
  public void traceCallToRun(HelloWorld hello, String[] params) {
    System.out.println("Dumping args");
    for (String param : params) {
      System.out.println(">>> " + param);
    }
  }
}