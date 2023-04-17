 public class Policy
{   
   //Declare fields for policy information
    private String policyNumber;
    private String providerName;
           
    //Constructor that initializes all string fields to ""
    public Policy()
    {
        policyNumber = "";
        providerName = "";
    }
    
    /*
    Constructor that initializes all fields with policy information from user input 
    @param num int variable that holds the policy number 
    @param provName String variable that holds the name of provider
    */
    public Policy(String num, String provName)
    {
        policyNumber = num;
        providerName = provName;
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
      return (Double.parseDouble(policyHolderWeight) * 703)/(Double.parseDouble(policyHolderHeight)*Double.parseDouble(policyHolderHeight));
    }
    
    /*
    Calculate the policy price
    @return policy price 
    */
    public double calcPolicyPrice()
    {
        final int BASE_FEE = 600;
        double policyPrice = BASE_FEE;
        
        if(Integer.parseInt(policyHolderAge) > 50)
        {
            policyPrice += 75;
        }

        if(policyHolderSmokingStatus.equals("smoker"))
        {
           policyPrice += 100;
        }

        if(calcBMI() > 35)
        {
            policyPrice += ((calcBMI() - 35) * 20);
        }

        return policyPrice;
    }
    
    public String toString()
    {   
      String str1 = "Policy Number: ";
      String str2 = "\nPolicy Provider: ";
      String str3 = "\nBMI: ";
      String str4 = "\nPolicy Price: ";
      
      return str1 + policyNumber + str2 + policyProvider + str3 + calcBMI() + str4 + calcPolicyPrice();
    }  
}
