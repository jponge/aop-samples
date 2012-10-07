import java.util.*;
import static java.util.Arrays.asList;
public class Main {

  public static void main(String... args) {
    List<Person> people = asList(
      new Person("Julien", "julien.ponge@insa-lyon.fr"),
      new Person("Mr Bean", "mrbean@gmail.com"),
      new Person("Fred", "frederic.le-mouel@insa-lyon.fr"),
      new Person("Antonio", "antonio.goncalves@gmail.com"));

    Collections.sort((List) people);
    for (Person p : people) {
      System.out.println(p);
    }
  }
}