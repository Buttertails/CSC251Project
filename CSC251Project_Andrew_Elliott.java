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
      
      for(int index = 0; index < policyList.size(); index++)
      {
         System.out.println("Policy Number: " + policyList.get(index).getPolicyNumber());
         System.out.println("Provider Name: " + policyList.get(index).getProviderName());
         System.out.println("Policyholder's First Name: " + policyList.get(index).getPolicyHolderFirstName());
         System.out.println("Policyholder's Last Name: " + policyList.get(index).getPolicyHolderLastName());
         System.out.println("Policyholder's Age: " + policyList.get(index).getPolicyHolderAge());
         System.out.println("Policyholder's Smoking Status: " + policyList.get(index).getPolicyHolderSmokingStatus());
         System.out.printf("Policyholder's Height: %.1f inches\n", Double.parseDouble(policyList.get(index).getPolicyHolderHeight()));
         System.out.printf("Policyholder's Weight: %.1f pounds\n", Double.parseDouble(policyList.get(index).getPolicyHolderWeight()));
         System.out.printf("Policyholder's BMI: %.2f\n", policyList.get(index).calcBMI());
         System.out.printf("Policy Price: $%.2f\n", policyList.get(index).calcPolicyPrice());
         System.out.println(); 
      }
      
      policyInfo.close();
     
      File file1 = new File("PolicyInformation.txt");
      Scanner policyInformation = new Scanner(file1);
      
      int numOfSmokers = 0;
      int numOfNonSmokers = 0;
      
      while(policyInformation.hasNext())
      {
         String smokingString = policyInformation.nextLine();
         
         if(smokingString.equals("smoker"))
            numOfSmokers++;
         else if(smokingString.equals("non-smoker"))
            numOfNonSmokers++;
      }
      
      System.out.println("The number of policies with a smoker is: " + numOfSmokers);
      System.out.print("The number of policies with a non-smoker is: " + numOfNonSmokers);
   }
}