/** UndergradStudent.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The UndergradStudent class is a concrete class that inherits from Student.java and defines variables which will later be used to store Affiliate data
 * The UndergradStudent class consists of basic accessor/mutator methods for Affiliate record variables
 */

import java.util.*;
public class UndergradStudent extends Student implements Printable{

  /** Number of courses taken by student*/
  protected int m_numCourseTaken;
  /** Scholarship amount of student*/
  protected int m_scholarshipAmount;
  /** Define a new instance of the Scanner object to read user input later*/
  Scanner input = new Scanner(System.in);

  /** Default Constructor*/
  public UndergradStudent(){
    super();
  }

  /** Overloaded Constructor - Creates UndergradStudent object given inherited variables, number of courses taken, and scholarship amount*/
  public UndergradStudent(String a, int b, String c, String d, int e, int f, String g, String h, String i, int j, int k){
    super(a,b,c,d,e,f,g,h,i);
    m_numCourseTaken = j;
    m_scholarshipAmount = k;
  }

  /** Accessor Method to get number of courses taken*/
  public int getNumCourseTaken(){
    return m_numCourseTaken;
  }
  /** Accessor Method to get the scholarship amount*/
  public int getScholarshipAmount(){
    return m_scholarshipAmount;
  }

  /** Mutator Method to set the number of courses taken*/
  public void setNumCourseTaken(int j){
    this.m_numCourseTaken = j;
  }
  /** Mutator Method to set the scholarship amount*/
  public void setScholarshipAmount(int k){
    this.m_scholarshipAmount = k;
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
    System.out.println("What is your Student ID number?");
    setStudentID(input.nextInt());
    input.nextLine();
    System.out.println("What is your major?");
    setMajor(input.nextLine());
    System.out.println("What is your minor?");
    setMinor(input.nextLine());
    System.out.println("What is your class standing? (Example:Sophomore)");
    setClassStanding(input.nextLine());
    System.out.println("How many courses have you taken?");
    setNumCourseTaken(input.nextInt());
    input.nextLine();
    System.out.println("What is your scholarship amount?");
    setScholarshipAmount(input.nextInt());
    input.nextLine();
  }

  /**Print method which returns a string containing Affiliate data in readable format*/
  public void print(){
    System.out.println("\nName: " + getName() +"\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber()
    + "\nYear came to Chapman: " + getYearCame() + "\nID Number: " + getStudentID() + "\nMajor: " + getMajor() + "\nMinor: " + getMinor()
    + "\nClass Standing: " + getClassStanding() + "\nNumber of Courses taken: " + getNumCourseTaken() + "\nScholarship amount: " + getScholarshipAmount() + "\n");
  }

}
