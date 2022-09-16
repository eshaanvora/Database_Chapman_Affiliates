/** ExecutiveStaff.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The ExecutiveStaff class is a concrete class that inherits from Staff.java and defines variables which will store Affiliate data
 * The ExecutiveStaff class consists of basic accessor/mutator methods for Affiliate record variables and a print method which returns a string containing Affiliate data
 */

import java.util.*;
public class ExecutiveStaff extends Staff implements Printable{

  /** Name of parking lot assigned*/
  protected String m_parkingLot;
  /** Rank of staff member*/
  protected String m_rank;
  /** Define a new instance of the Scanner object to read user input later*/
  Scanner input = new Scanner(System.in);

  /** Default Constructor*/
  public ExecutiveStaff(){
    super();
  }

  /** Overloaded Constructor - Creates ExecutiveStaff object given inherited variables, name of parking lot and staff rank */
  public ExecutiveStaff(String a, int b, String c, String d, int e, int f, String g, int h, String i, double j, boolean k, String l, String m){
    super(a,b,c,d,e,f,g,h,i,j,k);
    m_parkingLot = l;
    m_rank = m;
  }

  /** Accessor Method to get name of parking lot*/
  public String getParkingLot(){
    return m_parkingLot;
  }
  /** Accessor Method to get staff rank*/
  public String getRank(){
    return m_rank;
  }

  /** Mutator Method to set name of parking lot*/
  public void setParkingLot(String l){
    this.m_parkingLot = l;
  }
  /** Mutator Method to set staff rank*/
  public void setRank(String m){
    this.m_rank = m;
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
    System.out.println("Which parking lot do you have reserved parking for?");
    setParkingLot(input.nextLine());
    System.out.println("What is your job rank? (Assistant/Associate/Senior)");
    setRank(input.nextLine());

  }

  /**Print method which returns a string containing Affiliate data in readable format*/
  public void print(){
    System.out.println("\nName: " + getName() +"\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber()
    + "\nYear came to Chapman: " + getYearCame() + "\nID Number: " + getStaffID() + "\nBuilding: " + getBuilding() + "\nSupervisor ID: " + getSupervisorID()
    + "\nJob Title: " + getJobTitle() + "\nHourly Salary: " + getHourlySalary() + "\nFull-Time: " + getFullTime() + "\nParking Lot: " + getParkingLot()
    + "\nJob Rank: " + getRank());
  }

}
