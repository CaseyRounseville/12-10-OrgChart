// class to represent an emplayee - inherits Person
public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager manager;
  public Employee(String s1,String s2,int a,double wage,int hours,String job)
  {
    super(s1,s2,a);
    hourlyWage=wage;
    hoursWorked=hours;
    jobTitle=job;
  }
  public boolean equals(Object obj)
  {
    if(obj instanceof Employee)
    {
      Employee other=(Employee)obj;
      return super.equals(other)&&this.hourlyWage==other.hourlyWage&&this.hoursWorked==other.hoursWorked&&this.jobTitle==other.jobTitle&&this.manager==other.manager;
    }
    return false;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    double weeklySalary=hourlyWage*hoursWorked*7;
    return weeklySalary;
  }
  public double getYearlySalary()
  {
    return getWeeklySalary()*52;
  }
  public String getJobTitle()
  {
    return jobTitle;
  }
  public String toString()
  {
    return super.toString()+": "+jobTitle+" @ $"+getYearlySalary();
  }
  public String getManager()
  {
    return "Manager: "+getLastName()+", "+getFirstName();
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  public void setjobTitle(String title)
  {
    jobTitle=title;
  }
  public void giveRaise()
  {
    hourlyWage++;
  }
  public void setManager(Manager newManager)
  {
    if(manager!=null)
    {
      manager.removeDirectReport(this);
    }
    manager=newManager;
    manager.addDirectReport(this);
  }
}






  
  
  
  
