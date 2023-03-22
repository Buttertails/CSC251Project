import java.util.Scanner;
public class CSC251Project_Andrew_Elliott
{
    public static void main(String[] args)
    {
        //Create scanner object to hold user input
        Scanner keyboard = new Scanner(System.in);
        
        //Promt user for policy number and store in int variable
        System.out.println("Please enter the Policy Number");
        int policyNum = keyboard.nextInt();
        keyboard.nextLine();
       
        //Prompt user for provider name and store in String variable
        System.out.println("Please enter the Provider Name");
        String provName = keyboard.nextLine();
        
        //Prompt user for policyholder's first name and store in String variable
        System.out.println("Please enter the Policyholder's First Name");
        String policyFirstName = keyboard.nextLine();

        //Prompt user for policyholder's last name and store in String variable
        System.out.println("Please enter the Policyholder's Last Name");
        String policyLastName = keyboard.nextLine();
        
        //Prompt user for policyholder's age and store in int variable
        System.out.println("Please enter the Policyholder's Age");
        int policyAge = keyboard.nextInt();
        keyboard.nextLine();
        
        //Prompt user for policyholder's smoking status and store in String variable
        System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker)");
        String policySmoke = keyboard.nextLine();
        
        //Prompt user for policyholder's height and store in int variable
        System.out.println("Please enter the Policyholder's Height(in inches)");
        double policyHeight = keyboard.nextInt();
        keyboard.nextLine();
        
        //Prompt user for policyholder's weight and store in int variable
        System.out.println("Please enter the Policyholder's Weight(in pounds)");
        double policyWeight = keyboard.nextDouble();
        
        //Create policy object and initialize object with user input variables
        Policy policy = new Policy(policyNum, provName, policyFirstName, policyLastName, policyAge, policySmoke, policyHeight, policyWeight);
        
        //Display information from policy class 
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Policy Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getPolicyHolderFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getPolicyHolderLastName());
        System.out.println("Policyholder's Age: " + policy.getPolicyHolderAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getPolicyHolderHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getPolicyHolderWeight() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f\n", policy.calcBMI());
        System.out.printf("Policy Price: $%.2f", policy.calcPolicyPrice());
    }
}