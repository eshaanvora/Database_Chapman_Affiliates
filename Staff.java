/** Staff.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The Staff class is an abstract base class that inherits from Affiliate.java and defines variables which will later be used to store Affiliate data
 * The Staff class consists of basic accessor/mutator methods for Affiliate record variables
 */
public abstract class Staff extends Affiliate{

  /** ID Number of staff*/
  protected int m_staffID;
  /** Building where staff works*/
  protected String m_building;
  /** ID Number of staff member's Supervisor*/
  protected int m_supervisorID;
  /** Title of job*/
  protected String m_jobTitle;
  /** Hourly salary of staff member*/
  protected double m_hourlySalary;
  /** Boolean representing whether staff is full time or not*/
  protected boolean m_fullTime;


  /** Default Constructor*/
  public Staff(){
    super();
  }

  /** Overloaded Constructor - Creates Staff object given Affiliate record variables and staff ID, building, supervisor ID, job title, hourly salary, boolean representing full-time work status*/
  public Staff(String a, int b, String c, String d, int e, int f, String g, int h, String i, double j, boolean k){
    super(a,b,c,d,e);
    m_staffID = f;
    m_building = g;
    m_supervisorID = h;
    m_jobTitle = i;
    m_hourlySalary = j;
    m_fullTime = k;
  }

  /** Accessor Method to get Staff ID*/
  public int getStaffID(){
    return m_staffID;
  }
  /** Accessor Method to get building*/
  public String getBuilding(){
    return m_building;
  }
  /** Accessor Method to get supervisor ID*/
  public int getSupervisorID(){
    return m_supervisorID;
  }
  /** Accessor Method to get title of job*/
  public String getJobTitle(){
    return m_jobTitle;
  }
  /** Accessor Method to get hourly salary*/
  public double getHourlySalary(){
    return m_hourlySalary;
  }
  /** Accessor Method to get boolean representing full-time work status*/
  public boolean getFullTime(){
    return m_fullTime;
  }

  /** Mutator Method to set Staff ID*/
  public void setStaffID(int f){
    this.m_staffID = f;
  }
  /** Mutator Method to set building*/
  public void setBuilding(String g){
    this.m_building = g;
  }
  /** Mutator Method to set supervisor ID*/
  public void setSupervisorID(int h){
    this.m_supervisorID = h;
  }
  /** Mutator Method to set job title*/
  public void setJobTitle(String i){
    this.m_jobTitle = i;
  }
  /** Mutator Method to set hourly salary*/
  public void setHourlySalary(double j){
    this.m_hourlySalary = j;
  }
  /** Mutator Method to set full-time work status*/
  public void setFullTime(boolean k){
    this.m_fullTime = k;
  }
}
