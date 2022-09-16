/** StudentWorker.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The StudentWorker class is a concrete class that inherits from Staff.java and defines variables which will store Affiliate data
 * The StudentWorker class consists of basic accessor/mutator methods for Affiliate record variables and a print method which returns a string containing Affiliate data
 */

import java.util.*;
public class StudentWorker extends AcademicStaff implements Printable{

  /** Major of student*/
  protected String m_major;
  /** Boolean representing whether student has work-study or not*/
  protected boolean m_workStudy;
  /** Define a new instance of the Scanner object to read user input later*/
  Scanner input = new Scanner(System.in);

  /** Default Constructor*/
  public StudentWorker(){
    super();
  }

  /** Overloaded Constructor - Creates StudentWorker object given inherited variables, major and boolean representing student's work-study status */
  public StudentWorker(String a, int b, String c, String d, int e, int f, String g, int h, String i, double j, boolean k, String l, int m, String n, boolean o){
    super(a,b,c,d,e,f,g,h,i,j,k,l,m);
    m_major = n;
    m_workStudy = o;
  }

  /** Accessor Method to get major*/
  public String getMajor(){
    return m_major;
  }
  /** Accessor Method to get student's work-study status*/
  public boolean getWorkStudy(){
    return m_workStudy;
  }

  /** Mutator Method to set major*/
  public void setMajor(String n){
    this.m_major = n;
  }
  /** Mutator Method to set student's work-study status*/
  public void setWorkStudy(boolean o){
    this.m_workStudy = o;
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
    System.out.println("What is your major?");
    setMajor(input.nextLine());
    System.out.println("You are on Federal Work Study (true/false)");
    setWorkStudy(input.nextBoolean());

  }

  /**Print method which returns a string containing Affiliate data in readable format*/
  public void print(){
    System.out.println("\nName: " + getName() +"\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber()
    + "\nYear came to Chapman: " + getYearCame() + "\nID Number: " + getStaffID() + "\nBuilding: " + getBuilding() + "\nSupervisor ID: " + getSupervisorID()
    + "\nJob Title: " + getJobTitle() + "\nHourly Salary: " + getHourlySalary() + "\nFull-Time: " + getFullTime() + "\nSchool/College Department: " + getAcademicUnit()
    + "\nPay grade: " + getPayGrade() + "\nMajor: " + getMajor() + "\nFederal Work Study: " + getWorkStudy());
  }

}
