 public class Policy
{   
   //Declare fields for policy information
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int totalPolicyObjects = 0;
           
    //Constructor that initializes all string fields to ""
    public Policy()
    {
        policyNumber = "";
        providerName = "";
    }
    
    /*
    Constructor that initializes all fields with policy information from user input
    Increments totalPolicyObjects evertime a new Policy object is created
    @param num int variable that holds the policy number 
    @param provName String variable that holds the name of provider
    */
    public Policy(String num, String provName, PolicyHolder holder)
    {
        policyNumber = num;
        providerName = provName;
        policyHolder = new PolicyHolder(holder);
        totalPolicyObjects++;
    }
        
    /*
    Setter for the policy number
    @param num int variable that holds the policy number
    */
    public void setPolicyNumber(String num)
    {
        policyNumber = num;
    }

    /*
    Setter for the provider name
    @param provName String variable that holds the provider name
    */
    public void setProviderName(String provName)
    {
        providerName = provName;
    }
        
    /*
    Getter for the policy number
    @return policy number 
    */
    public String getPolicyNumber()
    {
        return policyNumber;
    }
    
    /*
    Getter for provider name
    @return provider name
    */
    public String getProviderName()
    {
        return providerName;
    }
        
    /*
    Calculates the BMI
    @return result from BMI calculation
    */
    public double calcBMI()
    {       
      return (Double.parseDouble(policyHolder.getPolicyHolderWeight()) * 703)/(Double.parseDouble(policyHolder.getPolicyHolderHeight())*Double.parseDouble(policyHolder.getPolicyHolderHeight()));
    }
    
    /*
    Calculate the policy price
    @return policy price 
    */
    public double calcPolicyPrice()
    {
        final int BASE_FEE = 600;
        double policyPrice = BASE_FEE;
        
        if(Integer.parseInt(policyHolder.getPolicyHolderAge()) > 50)
        {
            policyPrice += 75;
        }

        if(policyHolder.getPolicyHolderSmokingStatus().equals("smoker"))
        {
           policyPrice += 100;
        }

        if(calcBMI() > 35)
        {
            policyPrice += ((calcBMI() - 35) * 20);
        }

        return policyPrice;
    }
    
    //returns the total number of policy objects 
    public int getTotalPolicyObjects()
    {
      return totalPolicyObjects;
    }
    
    //toString method to display data
    public String toString()
    {        
      return String.format("Policy Number: " + policyNumber + 
             "\nProvider Name: " + providerName +
             policyHolder.toString() + 
             "\nPolicyholder's BMI: %.2f" +  
             "\nPolicy Price: $%.2f\n", calcBMI(), calcPolicyPrice());
    }  
}
