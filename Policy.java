public class Policy
{   
   //Declare fields for policy information
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;
   
    //Constructor that initializes all numerical fields to 0 and all string fields to ""
    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        policyHolderFirstName = "";
        policyHolderLastName = "";
        policyHolderAge = 0;
        policyHolderSmokingStatus = "";
        policyHolderHeight = 0;
        policyHolderWeight = 0;
    }
    
    /*
    Constructor that initializes all fields with policy information from user input 
    @param num int variable that holds the policy number 
    @param provName String variable that holds the name of provider
    @param firstName String variable that holds the first name of the policyholder
    @param lastName String variable that holds the last name of the policyholder
    @param age int variable that holds the age of the policyholder
    @param smoking String variable that holds rather or not the policyholder is a smoker
    @param height double variable that holds the height of the policyholder
    @param weight double variable that holds the weight of the policyholder 
    */
    public Policy(int num, String provName, String firstName, String lastName, int age, String smoking, double height, double weight)
    {
        policyNumber = num;
        providerName = provName;
        policyHolderFirstName = firstName;
        policyHolderLastName = lastName;
        policyHolderAge = age;
        policyHolderSmokingStatus = smoking;
        policyHolderHeight = height;
        policyHolderWeight = weight;
    }
    
    /*
    Setter for the policy number
    @param num int variable that holds the policy number
    */
    public void setPolicyNumber(int num)
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
    Setter for the policyholder's first name
    @param firstName String variable that holds the policyholder's first name
    */
    public void setPolicyHolderFirstName(String firstName)
    {
        policyHolderFirstName = firstName;
    }
    
    /*
    Setter for the policyholder's last name
    @param lastName String variable that holds the policyholder's last name
    */
    public void setPolicyHolderLastName(String lastName)
    {
        policyHolderLastName = lastName;
    }
    
    /*
    Setter for the policyholder's age
    @param age int variable that holds the policyholder's age
    */
    public void setPolicyHolderAge(int age)
    {
        policyHolderAge = age;
    }
    
    /*
    Setter for the policyholder's smoking status
    @param smoking String variable that holds the smoking status of the policyholder
    */
    public void setPolicyHolderSmokingStatus(String smoking)
    {
        policyHolderSmokingStatus = smoking;
    }
    
    /*
    Setter for the policyholder's height
    @param height double variable that holds the height of the policyholder 
    */
    public void setPolicyHolderHeight(double height)
    {
        policyHolderHeight = height;
    }
    
    /*
    Setter for the policyholder's weight
    @param weight double variable that holds the weight of the policyholder
    */
    public void setPolicyHolderWeight(double weight)
    {
        policyHolderWeight = weight;
    }
    
    /*
    Getter for the policy number
    @return policy number 
    */
    public int getPolicyNumber()
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
    Getter for policyholder's first name
    @return policyholder's first name 
    */
    public String getPolicyHolderFirstName()
    {
        return policyHolderFirstName;
    }
    
    /*
    Getter for policyholder's last name
    @return policyholder's last name
    */
    public String getPolicyHolderLastName()
    {
        return policyHolderLastName;
    }
    
    /*
    Getter for policyholder's agre
    @return policyholder's age
    */
    public int getPolicyHolderAge()
    {
        return policyHolderAge;
    }
    
    /*
    Getter for policyholder's smoking status
    @return policyholder's smoking status
    */
    public String getPolicyHolderSmokingStatus()
    {
        return policyHolderSmokingStatus;
    }
    
    /*
    Getter for policyholder's height
    @return policyholder's height
    */
    public double getPolicyHolderHeight()
    {
        return policyHolderHeight;
    }
    
    /*
    Getter for policyholder's weight
    @return policyholder's weight
    */
    public double getPolicyHolderWeight()
    {
        return policyHolderWeight;
    }
    
    /*
    Calculates the BMI
    @return result from BMI calculation
    */
    public double calcBMI()
    {
        return (policyHolderWeight * 703)/(policyHolderHeight*policyHolderHeight);
    }
    
    /*
    Calculate the policy price
    @return policy price 
    */
    public double calcPolicyPrice()
    {
        final int BASE_FEE = 600;
        double policyPrice = BASE_FEE;
        
        if(policyHolderAge > 50)
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
}
