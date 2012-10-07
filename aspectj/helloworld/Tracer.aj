aspect Tracer {
  
  before(): target(HelloWorld) && call(void run(String...)) {
    System.out.println("Calling run()");
  }
}