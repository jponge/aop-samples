aspect ArgsTracer {
  
  before(HelloWorld hello, String[] params): 
    target(hello) && 
    call(void run(String...)) &&
    args(params) {
      System.out.println("Dumping args");
      for (String param : params) {
        System.out.println(">>> " + param);
      }
    }
}