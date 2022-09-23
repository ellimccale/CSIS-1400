public class Employee
{
   // fields
	private String firstName;
   private String lastName;
   private double salary;

	// constructors
   public Employee(String fName, String lName, double s)
   {
      firstName = fName;
      lastName = lName;
      this.setSalary(s);
   }

   // methods
   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public double getSalary()
   {
      return salary;
   }

   public void setSalary(double s)
   {
      if (s >= 0)
      {
         salary = s;
      }
   }
}