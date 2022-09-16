/** Affiliate.java
* @author Eshaan Vora
* @author EshaanVora@gmail.com
*/

/** DRIVER CLASS */

import java.util.*;

public class Database{

  /** Main method*/
  public static void main(String[] args){

  /** Variable to store user input from first question asked*/
  int choice1 = 0;
  /** Define a new instance of the Scanner object to read user input later*/
  Scanner input = new Scanner(System.in);
  /** Hashmap to store affiliate object as VALUE and id of affiliate as KEY*/
  HashMap<Integer,Affiliate> hmap = new HashMap<>();

  System.out.println("Welcome to the Chapman affiliate database!");

  /** Loop to keep program running until user chooses to exit*/
  while(choice1 != 5){
    System.out.println("What you would you like to do?");
    System.out.println("1) Create an affiliate record");
    System.out.println("2) Print information for an Affiliate given the id");
    System.out.println("3) List all affiliates in order of seniority");
    System.out.println("4) Delete a record given the id");
    System.out.println("5) Exit");

    choice1 = input.nextInt();

    //Asks user what type of object they want to create and builds object based on user input
    if(choice1 == 1){
      System.out.println("To create an affiliate record, please answer the following questions");
      System.out.println("Are you\n1)Faculty\n2)Staff\n3)Student");
      //Variable to store user input from second question asked
      int choice2 = input.nextInt();
      if(choice2 == 1){
        System.out.println("Are you a\n1)Associate Professor\n2)Assistant Professor\n3)Full-Time Professor");
        //Variable to store user input from third question asked
        int choice3 = input.nextInt();
        if(choice3 == 1){
          AssociateProfessor a = new AssociateProfessor();
          //Build affiliate record based on type of affiliate
          a.buildAffiliateRecord();
          hmap.put(a.getFacultyID(),a);
          System.out.println("Affiliate Record has successfully been added\n");
        }
        if(choice3 == 2){
          AssistantProfessor a = new AssistantProfessor();
          a.buildAffiliateRecord();
          hmap.put(a.getFacultyID(),a);
          System.out.println("Affiliate Record has successfully been added\n");
        }
        if(choice3 == 3){
          FullProfessor a = new FullProfessor();
          a.buildAffiliateRecord();
          hmap.put(a.getFacultyID(),a);
          System.out.println("Affiliate Record has successfully been added\n");
        }
      }
      if(choice2 == 2){
        System.out.println("Are you an\n1)Executive Staff Member\n2)Academic Staff Member\n3)Student Worker");
        int choice3 = input.nextInt();
        if(choice3 == 1){
          ExecutiveStaff a = new ExecutiveStaff();
          a.buildAffiliateRecord();
          hmap.put(a.getStaffID(),a);
          System.out.println("Affiliate Record has successfully been added\n");
        }
        if(choice3 == 2){
          AcademicStaff a = new AcademicStaff();
          a.buildAffiliateRecord();
          hmap.put(a.getStaffID(),a);
          System.out.println("Affiliate Record has successfully been added\n");
        }
        if(choice3 == 3){
          StudentWorker a = new StudentWorker();
          a.buildAffiliateRecord();
          hmap.put(a.getStaffID(),a);
          System.out.println("Affiliate Record has successfully been added\n");
        }
      }
      if(choice2 == 3){
        System.out.println("Are you an\n1)Undergraduate Student\n2)Graduate Student");
        int choice3 = input.nextInt();
        if(choice3 == 1){
          UndergradStudent a = new UndergradStudent();
          a.buildAffiliateRecord();
          hmap.put(a.getStudentID(),a);
          System.out.println("Affiliate Record has successfully been added\n");
        }
        if(choice3 == 2){
          GradStudent a = new GradStudent();
          a.buildAffiliateRecord();
          hmap.put(a.getStudentID(),a);
          System.out.println("Affiliate Record has successfully been added\n");
        }
      }
    }
    //Prints affiliate data based on type of affiliate
    else if(choice1 == 2){
      System.out.println("Please enter an ID number to lookup");
      int id = input.nextInt();
      hmap.get(id).print();
    }
    //Prints affiliate's name based on seniority (or when affiliate came to Chapman)
    else if(choice1 == 3){
      ArrayList<Affiliate> sorted = new ArrayList<Affiliate>(hmap.values());
      Collections.sort(sorted);
      System.out.println("List of Affiliates by seniority: ");
      for(Affiliate record : sorted){
	       System.out.println("Name: " + record.getName() + "\nYear came to Chapman: "
         + record.getYearCame() + "\n");
      }
    }

    //Finds object in hashmap based on key and deletes the object
    else if(choice1 == 4){
      System.out.println("Please enter an ID number to delete the record");
      int id = input.nextInt();
      hmap.remove(id);
      System.out.println("Affiliate record has been deleted! \n");

    }
    else if(choice1 == 5){
      System.exit(0);
    }
    else {
      System.out.println("Invalid input. Please try again.");
    }
  }
  }
}
