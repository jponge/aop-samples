public class Person {
  
  private final String name;
  private final String email;
  
  public Person(String name, String email){
    super();
    this.name = name;
    this.email = email;
  }
  
  public String getName() {
    return name;
  }
  
  public String getEmail() {
    return name;
  }
  
  @Override
  public String toString() {
    return name + " <" + email + ">";
  }
}