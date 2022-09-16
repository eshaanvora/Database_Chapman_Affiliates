/** Student.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The Student class is an abstract base class that inherits from Affiliate.java and defines variables which will later be used to store Affiliate data
 * The Student class consists of basic accessor/mutator methods for Affiliate record variables
 */

public abstract class Student extends Affiliate{
  /** ID Number of student*/
  protected int m_studentID;
  /** Student's major*/
  protected String m_major;
  /** Student's minor*/
  protected String m_minor;
  /** Class standing of student*/
  protected String m_classStanding;

  /** Default Constructor*/
  public Student(){
    super();
  }

  /** Overloaded Constructor - Creates Student object given Affiliate record variables and student ID, major, minor, class standing*/
  public Student(String a, int b, String c, String d, int e, int f, String g, String h, String i){
    super(a,b,c,d,e);
    m_studentID = f;
    m_major = g;
    m_minor = h;
    m_classStanding = i;
  }

  /** Accessor Method to get Student ID*/
  public int getStudentID(){
    return m_studentID;
  }
  /** Accessor Method to get major*/
  public String getMajor(){
    return m_major;
  }
  /** Accessor Method to get minor*/
  public String getMinor(){
    return m_minor;
  }
  /** Accessor Method to get class standing*/
  public String getClassStanding(){
    return m_classStanding;
  }

  /** Mutator Method to set Student ID*/
  public void setStudentID(int f){
    this.m_studentID = f;
  }
  /** Mutator Method to set major*/
  public void setMajor(String g){
    this.m_major = g;
  }
  /** Mutator Method to set minor*/
  public void setMinor(String h){
    this.m_minor = h;
  }
  /** Mutator Method to set class standing*/
  public void setClassStanding(String i){
    this.m_classStanding = i;
  }

}
