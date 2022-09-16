/** Affiliate.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** The Affiliate class is an abstract base class used to define the variables which will later be used to store user input data
 * The Affiliate class consists of basic accessor/mutator methods for Affiliate record variables
 */

 /** Interface which will be defined to print Affiliate data in readable format*/
 interface Printable{
   public void print();
 }

public abstract class Affiliate implements Comparable<Affiliate>, Printable{
  /** Name of affiliate*/
  protected String m_name;
  /** Age of affiliate*/
  protected int m_age;
  /** Address of affiliate*/
  protected String m_address;
  /** Phone Number of affiliate*/
  protected String m_phoneNumber;
  /** Year the person became affiliated with Chapman University */
  protected int m_yearCame;

  /** Default Constructor*/
  public Affiliate(){
  }

  /** Overloaded Constructor - Creates Affiliate object given name, age, address, phone number, year came*/
  public Affiliate(String a, int b, String c, String d, int e){
    m_name = a;
    m_age = b;
    m_address = c;
    m_phoneNumber = d;
    m_yearCame = e;
  }

  /** Comparable Method which compares Affiliate objects based on the year came to Chapman  */
  public int compareTo(Affiliate a){
    if(m_yearCame > a.m_yearCame){
      return 1;
    }
    else if(m_yearCame < a.m_yearCame){
      return -1;
    }
    else{
      return 0;
    }
  }

  /** Accessor Method to get Name*/
  public String getName(){
    return m_name;
  }
  /** Accessor Method to get Age*/
  public int getAge(){
    return m_age;
  }
  /** Accessor Method to get Address*/
  public String getAddress(){
    return m_address;
  }
  /** Accessor Method to get Phone Number*/
  public String getPhoneNumber(){
    return m_phoneNumber;
  }
  /** Accessor Method to get year came to Chapman*/
  public int getYearCame(){
    return m_yearCame;
  }

  /** Mutator Method to set Name*/
  public void setName(String a){
    this.m_name = a;
  }
  /** Mutator Method to set Age*/
  public void setAge(int b){
    this.m_age = b;
  }
  /** Mutator Method to set Address*/
  public void setAddress(String c){
    this.m_address = c;
  }
  /** Mutator Method to set Phone Number*/
  public void setPhoneNumber(String d){
    this.m_phoneNumber = d;
  }
  /** Mutator Method to set the year came to Chapman*/
  public void setYearCame(int e){
    this.m_yearCame = e;
  }

}
