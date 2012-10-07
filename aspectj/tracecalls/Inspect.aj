import java.util.Arrays;

privileged aspect Inspect {
  
  private int numberOfMethodInvocations = 0;
  
  pointcut methodFromMain(Main main):
    target(main) && (call(* *(..)) || initialization(Main.new()));
  
  before(Main main): methodFromMain(main) {
    numberOfMethodInvocations = numberOfMethodInvocations + 1;
    System.out.println(">>> invocation of " + thisJoinPoint +
      " with args: " + Arrays.toString(thisJoinPoint.getArgs()));
    System.out.println("    invocation #" + numberOfMethodInvocations);
  }
}