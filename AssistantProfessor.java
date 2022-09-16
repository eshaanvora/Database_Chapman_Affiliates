/** AssistantProfessor.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The AssistantProfessor class is a concrete class that inherits from Faculty.java and defines variables which will store Affiliate data
 * The AssistantProfessor class consists of basic accessor/mutator methods for Affiliate record variables and a print method which returns a string containing Affiliate data
 */

import java.util.*;
public class AssistantProfessor extends Faculty implements Printable{

  /** Years until tenure for faculty member*/
  protected int m_yearsUntilTenure;

  /** Define a new instance of the Scanner object to read user input later*/
  Scanner input = new Scanner(System.in);

  /** Default Constructor*/
  public AssistantProfessor(){
    super();
  }

  /** Overloaded Constructor - Creates AssistantProfessor object given inherited variables and years until tenure*/
  public AssistantProfessor(String a, int b, String c, String d, int e, int f, String g, int h, int i, int j){
    super(a,b,c,d,e,f,g,h,i);
    m_yearsUntilTenure = j;
  }

  /** Accessor Method to get the years until tenure of professor*/
  public int getYearsUntilTenure(){
    return m_yearsUntilTenure;
  }
  /** Mutator Method to set the years until tenure of professor*/
  public void setYearsUntilTenure(int j){
    this.m_yearsUntilTenure = j;
  }

  /** Method to build Affiliate record based on capturing and storing user input
  * Set user input to member variables of object type
  */
  public void buildAffiliateRecord(){
    System.out.println("What is your name?");
    setName(input.nextLine());
    System.out.println("What is your age?");
    setAge(input.nextInt());
    input.nextLine();
    System.out.println("What is your address?");
    setAddress(input.nextLine());
    System.out.println("What is your phone number?");
    setPhoneNumber(input.nextLine());
    System.out.println("What year did you come to Chapman?");
    setYearCame(input.nextInt());
    input.nextLine();
    System.out.println("What is your Faculty ID number?");
    setFacultyID(input.nextInt());
    input.nextLine();
    System.out.println("What department do you work in?");
    setDepartment(input.nextLine());
    System.out.println("What is your yearly salary?");
    setSalary(input.nextInt());
    input.nextLine();
    System.out.println("How many papers have you published?");
    setNumPaper(input.nextInt());
    input.nextLine();
    System.out.println("How many years until you will be tenured?");
    setYearsUntilTenure(input.nextInt());
  }

  /**Print method which returns a string containing Affiliate data in readable format*/
  public void print(){
    System.out.println("\nName: " + getName() +"\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber()
    + "\nYear came to Chapman: " + getYearCame() + "\nID Number: " + getFacultyID() + "\nDepartment: " + getDepartment() + "\nYearly Salary: " + getSalary()
    + "\nNumber of Papers Published: " + getNumPaper() + "\nYears until tenure: " + getYearsUntilTenure() + "\n");
  }

}
