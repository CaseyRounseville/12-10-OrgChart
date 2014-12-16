// main program to drive org chart
//Casey Rounseville
//9O
//12-11-2014
public class OrgChart
{
  public static void main(String[] args)
  {
    Manager manager1=new Manager("Caesar","Flickerman",20,50.0,12,"Development Manager","Department 1");
    Manager manager2=new Manager("Plutarch","Heavensbee",20,52.0,11,"Development Manager","Department 2");
    Employee employee1=new Employee("Peeta","Mellark",20,40.0,9,"SR Developer");
    Employee employee2=new Employee("Katniss","Everdeen",20,45.0,10,"JR Developer");
    Employee employee3=new Employee("Finnick","Odair",20,45.0,8,"JR Developer");
    employee1.setManager(manager1);
    employee2.setManager(manager1);
    employee3.setManager(manager2);
    /*System.out.println(manager1.toString());
    System.out.println("    "+employee1.toString());
    System.out.println("    "+employee2.toString());
    System.out.println(manager2.toString());
    System.out.println("    "+employee3.toString());*/
    printInfo(manager1);
    printInfo(employee1);
    printInfo(employee2);
    printInfo(manager2);
    printInfo(employee3);
  }
    public static void printInfo(Person p)
    {
      if(p instanceof Manager)
      {
        Manager other=(Manager)p;
        System.out.println(other.toString());
      }
      if(p instanceof Employee)
      {
        Employee other=(Employee)p;
        System.out.println("    "+p.toString());
      }
    }
  }
