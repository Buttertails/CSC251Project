import java.io.File;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class CSC251Project_Andrew_Elliott
{
   public static void main(String[] args) throws IOException
   {      
      //Open PolicyInformation.txt file for input
      File file = new File("PolicyInformation.txt");
      Scanner policyInfo = new Scanner(file);
      
      //Create ArrayList to store Policy objects
      ArrayList<Policy> policyList = new ArrayList<>();
      
      //Policy information variables      
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      String age;
      String smoking;
      String height;
      String weight;
            
      //Reads input from policyInfo file and determines number of (non)smokers
      while(policyInfo.hasNext())
      {
         policyNumber = policyInfo.nextLine();
         providerName = policyInfo.nextLine();
         firstName = policyInfo.nextLine();
         lastName = policyInfo.nextLine();
         age = policyInfo.nextLine();
         smoking = policyInfo.nextLine();
         height = policyInfo.nextLine();
         weight = policyInfo.nextLine();
         if(policyInfo.hasNext())
            policyInfo.nextLine();
            
         //Create PolicyHolder object initialized with input from file   
         PolicyHolder policyholder = new PolicyHolder(firstName, lastName, age, smoking, height, weight);
         //Create Policy object initialized with file input and PolicyHolder object
         Policy policy = new Policy(policyNumber, providerName, policyholder);
         //Add policy to Policy ArrayList
         policyList.add(policy);
         
      }
      
      //Display policy information by implicitly calling toString method in Policy class
      for(int index = 0; index < policyList.size(); index++)
      {
         System.out.println(policyList.get(index));
      }
      
      //Close policyInfo file
      policyInfo.close();
     
      //Open policyInfo file to determine number of smokers
      File file1 = new File("PolicyInformation.txt");
      Scanner policyInformation = new Scanner(file1);
      
      //Declare number of smokers variables
      int numOfSmokers = 0;
      int numOfNonSmokers = 0;
      
      //Read file for number of smokers
      while(policyInformation.hasNext())
      {
         //Declare string variable to hold each line of input from file
         String smokingString = policyInformation.nextLine();
         
         //Increment number of smokers/nonsmokers when file reads smoker or nonsmoker
         if(smokingString.equals("smoker"))
            numOfSmokers++;
         else if(smokingString.equals("non-smoker"))
            numOfNonSmokers++;
      }
      //Display number of policy objects, number of smokers, and number of non-smokers
      System.out.println("There were " + policyList.get(0).getTotalPolicyObjects() + " Policy objects created.\n");
      System.out.println("The number of policies with a smoker is: " + numOfSmokers);
      System.out.print("The number of policies with a non-smoker is: " + numOfNonSmokers);
   }
}