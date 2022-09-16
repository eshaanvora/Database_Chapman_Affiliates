/** AcademicStaff.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The AcademicStaff class is a concrete class that inherits from Staff.java and defines variables which will store Affiliate data
 * The AcademicStaff class consists of basic accessor/mutator methods for Affiliate record variables and a print method which returns a string containing Affiliate data
 */

import java.util.*;
public class AcademicStaff extends Staff implements Printable{
  /** The school or college to which staff member is assigned,*/
  protected String m_academicUnit;
  /** Integer representing the pay scale grade*/
  protected int m_payGrade;
  /** Define a new instance of the Scanner object to read user input later*/
  Scanner input = new Scanner(System.in);

  /** Default Constructor*/
  public AcademicStaff(){
    super();
  }

  /** Overloaded Constructor - Creates ExecutiveStaff object given inherited variables, academic unit, and pay scale */
  public AcademicStaff(String a, int b, String c, String d, int e, int f, String g, int h, String i, double j, boolean k, String l, int m){
    super(a,b,c,d,e,f,g,h,i,j,k);
    m_academicUnit = l;
    m_payGrade = m;
  }

  /** Accessor Method to get academic unit*/
  public String getAcademicUnit(){
    return m_academicUnit;
  }
  /** Accessor Method to get pay grade*/
  public int getPayGrade(){
    return m_payGrade;
  }

  /** Mutator Method to set academic unit*/
  public void setAcademicUnit(String l){
    this.m_academicUnit = l;
  }
  /** Mutator Method to set pay grade*/
  public void setPayGrade(int m){
    this.m_payGrade = m;
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
    System.out.println("What is your Staff ID number?");
    setStaffID(input.nextInt());
    input.nextLine();
    System.out.println("Which building do you work in?");
    setBuilding(input.nextLine());
    System.out.println("What is your Supervisor's ID number?");
    setSupervisorID(input.nextInt());
    input.nextLine();
    System.out.println("What is your job title?");
    setJobTitle(input.nextLine());
    System.out.println("What is your hourly salary?");
    setHourlySalary(input.nextInt());
    input.nextLine();
    System.out.println("You work full-time (true/false)");
    setFullTime(input.nextBoolean());
    input.nextLine();
    System.out.println("Which school/college are you assigned to?");
    setAcademicUnit(input.nextLine());
    System.out.println("What is your pay grade? (1-4)");
    setPayGrade(input.nextInt());
    input.nextLine();
  }

  /**Print method which returns a string containing Affiliate data in readable format*/
  public void print(){
    System.out.println("\nName: " + getName() +"\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber()
    + "\nYear came to Chapman: " + getYearCame() + "\nID Number: " + getStaffID() + "\nBuilding: " + getBuilding() + "\nSupervisor ID: " + getSupervisorID()
    + "\nJob Title: " + getJobTitle() + "\nHourly Salary: " + getHourlySalary() + "\nFull-Time: " + getFullTime() + "\nSchool/College Department: " + getAcademicUnit()
    + "\nPay grade: " + getPayGrade());
  }
}
