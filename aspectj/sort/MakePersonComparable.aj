aspect MakePersonComparable {
  
  declare parents: Person implements Comparable<Person>;
  
  public int Person.compareTo(Person other) {
    return getName().compareTo(other.getName());
  }
}