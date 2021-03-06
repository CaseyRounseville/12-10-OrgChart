// Super Class to represent a person
public class Person
{
  private String firstName;
  private String lastName;
  private int age;
  public Person()
  {
    firstName="";
    lastName="";
    age=0;
  }
  public Person(String s1,String s2,int a)
  {
    firstName=s1;
    lastName=s2;
    age=a;
  }
  public boolean equals(Object obj)
  {
    if(obj instanceof Person)
    {
      Person other=(Person)obj;
      return this.getFirstName()==other.getFirstName()&&this.getLastName()==other.getLastName()&&this.getAge()==other.getAge();
    }
    return false;
  }
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public int getAge()
  {
    return age;
  }
  public String toString()
  {
    String names=lastName+", "+firstName;
    return names;
  }
  public void recordBirthday()
  {
    age++;
  }
}

