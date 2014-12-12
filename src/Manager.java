// class to represent a manager - inherits Emplyee
import java.util.ArrayList;
public class Manager extends Employee
{
  private ArrayList directReport=new ArrayList<Employee>();
  private String department;
  public Manager(String s1,String s2,int a,double wage,int hours,String job,String dept)
  {
    super(s1,s2,a,wage,hours,job);
    department=dept;
  }
  public String getDepartment()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports()
  {
    return directReport;
  }
  public String toString()
  {
    return "Manager: "+super.toString();
  }
  public void addDirectReport(Employee employee)
  {
    directReport.add(employee);
  }
  public void removeDirectReport(Employee employee)
  {
    directReport.remove(employee);
  }
  public void setDepartment(String dept)
  {
    department=dept;
  }
}
