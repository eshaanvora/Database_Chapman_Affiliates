/** Faculty.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The Faculty class is an abstract base class that inherits from Affiliate.java and defines variables which will later be used to store Affiliate data
 * The Faculty class consists of basic accessor/mutator methods for Affiliate record variables
 */

public abstract class Faculty extends Affiliate{
  /** ID Number of faculty member*/
  protected int m_facultyID;
  /** The Department which faculty member works in*/
  protected String m_department;
  /** Salary of faculty member*/
  protected int m_salary;
  /** Number of papers that faculty member has published*/
  protected int m_numpaper;

  /** Default Constructor*/
  public Faculty(){
    super();
  }

  /** Overloaded Constructor - Creates Faculty object given Affiliate record variables and faculty ID, department, salary, number of papers published*/
  public Faculty(String a, int b, String c, String d, int e, int f, String g, int h, int i){
    super(a,b,c,d,e);
    m_facultyID = f;
    m_department = g;
    m_salary = h;
    m_numpaper = i;
  }

  /** Accessor Method to get Faculty ID*/
  public int getFacultyID(){
    return m_facultyID;
  }
  /** Accessor Method to get Department*/
  public String getDepartment(){
    return m_department;
  }
  /** Accessor Method to get Salary*/
  public int getSalary(){
    return m_salary;
  }
  /** Accessor Method to get number of papers*/
  public int getNumPaper(){
    return m_numpaper;
  }

  /** Mutator Method to set Faculty ID*/
  public void setFacultyID(int f){
    this.m_facultyID = f;
  }
  /** Mutator Method to set Department*/
  public void setDepartment(String g){
    this.m_department = g;
  }
  /** Mutator Method to set Salary*/
  public void setSalary(int h){
    this.m_salary = h;
  }
  /** Mutator Method to set number of papers published*/
  public void setNumPaper(int i){
    this.m_numpaper = i;
  }

}
