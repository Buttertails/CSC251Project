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
      
      ArrayList<Policy> policyList = new ArrayList<>();
            
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      String age;
      String smoking;
      String height;
      String weight;
      
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
         policyInfo.nextLine();
         Policy policy1 = new Policy(policyNumber, providerName, firstName, lastName, age, smoking, height, weight);
         policyList.add(policy1);
   
         policyNumber = policyInfo.nextLine();
         providerName = policyInfo.nextLine();
         firstName = policyInfo.nextLine();
         lastName = policyInfo.nextLine();
         age = policyInfo.nextLine();
         smoking = policyInfo.nextLine();
         height = policyInfo.nextLine();
         weight = policyInfo.nextLine();
         policyInfo.nextLine();
         Policy policy2 = new Policy(policyNumber, providerName, firstName, lastName, age, smoking, height, weight);
         policyList.add(policy2);
         
         policyNumber = policyInfo.nextLine();
         providerName = policyInfo.nextLine();
         firstName = policyInfo.nextLine();
         lastName = policyInfo.nextLine();
         age = policyInfo.nextLine();
         smoking = policyInfo.nextLine();
         height = policyInfo.nextLine();
         weight = policyInfo.nextLine();
         policyInfo.nextLine();
         Policy policy3 = new Policy(policyNumber, providerName, firstName, lastName, age, smoking, height, weight);      
         policyList.add(policy3);
         
         policyNumber = policyInfo.nextLine();
         providerName = policyInfo.nextLine();
         firstName = policyInfo.nextLine();
         lastName = policyInfo.nextLine();
         age = policyInfo.nextLine();
         smoking = policyInfo.nextLine();
         height = policyInfo.nextLine();
         weight = policyInfo.nextLine();
         policyInfo.nextLine();
         Policy policy4 = new Policy(policyNumber, providerName, firstName, lastName, age, smoking, height, weight);   
         policyList.add(policy4);
        
         policyNumber = policyInfo.nextLine();
         providerName = policyInfo.nextLine();
         firstName = policyInfo.nextLine();
         lastName = policyInfo.nextLine();
         age = policyInfo.nextLine();
         smoking = policyInfo.nextLine();
         height = policyInfo.nextLine();
         weight = policyInfo.nextLine();
         policyInfo.nextLine();
         Policy policy5 = new Policy(policyNumber, providerName, firstName, lastName, age, smoking, height, weight);   
         policyList.add(policy5);
         
         policyNumber = policyInfo.nextLine();
         providerName = policyInfo.nextLine();
         firstName = policyInfo.nextLine();
         lastName = policyInfo.nextLine();
         age = policyInfo.nextLine();
         smoking = policyInfo.nextLine();
         height = policyInfo.nextLine();
         weight = policyInfo.nextLine();
         Policy policy6 = new Policy(policyNumber, providerName, firstName, lastName, age, smoking, height, weight);          
         policyList.add(policy6);
      }
   }
}