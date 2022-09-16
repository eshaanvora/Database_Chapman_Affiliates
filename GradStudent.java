/** GradStudent.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The GradStudent class is a concrete class that inherits from Student.java and defines variables which will later be used to store Affiliate data
 * The GradStudent class consists of basic accessor/mutator methods for Affiliate record variables
 */

import java.util.*;
public class GradStudent extends Student implements Printable{

  /** Number of papers published by student*/
  protected int m_numPaperPublished;
  /** Name of Thesis Advisor of student*/
  protected String m_thesisAdvisor;
  /** Define a new instance of the Scanner object to read user input later*/
  Scanner input = new Scanner(System.in);

  /** Default Constructor*/
  public GradStudent(){
    super();
  }

  /** Overloaded Constructor - Creates GradStudent object given inherited variables, number of papers published, and name of thesis advisor*/
  public GradStudent(String a, int b, String c, String d, int e, int f, String g, String h, String i, int j, String k){
    super(a,b,c,d,e,f,g,h,i);
    m_numPaperPublished = j;
    m_thesisAdvisor = k;
  }

  /** Accessor Method to get number papers published*/
  public int getNumPaperPublished(){
    return m_numPaperPublished;
  }
  /** Accessor Method to get name of thesis advisor*/
  public String getThesisAdvisor(){
    return m_thesisAdvisor;
  }

  /** Mutator Method to set the number of papers published*/
  public void setNumPaperPublished(int j){
    this.m_numPaperPublished = j;
  }
  /** Mutator Method to set the name of thesis advisors*/
  public void setThesisAdvisor(String k){
    this.m_thesisAdvisor = k;
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
    System.out.println("How many papers have you published?");
    setNumPaperPublished(input.nextInt());
    input.nextLine();
    System.out.println("Who is your Thesis Advisor?");
    setThesisAdvisor(input.nextLine());
  }

  /**Print method which returns a string containing Affiliate data in readable format*/
  public void print(){
    System.out.println("\nName: " + getName() +"\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber()
    + "\nYear came to Chapman: " + getYearCame() + "\nID Number: " + getStudentID() + "\nMajor: " + getMajor() + "\nMinor: " + getMinor()
    + "\nClass Standing: " + getClassStanding() + "\nNumber of Papers Published: " + getNumPaperPublished() + "\nThesis Advisor: " + getThesisAdvisor() + "\n");
  }

}
