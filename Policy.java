public class Policy
{   
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private int policyHolderHeight;
    private int policyHolderWeight;

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
    
    public Policy(int num, String provName, String firstName, String lastName, int age, String smoking, int height, int weight)
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

    public void setPolicyNumber(int num)
    {
        policyNumber = num;
    }

    public void setProviderName(String provName)
    {
        providerName = provName;
    }

    public void setPolicyHolderFirstName(String firstName)
    {
        policyHolderFirstName = firstName;
    }

    public void setPolicyHolderLastName(String lastName)
    {
        policyHolderLastName = lastName;
    }

    public void setPolicyHolderAge(int age)
    {
        policyHolderAge = age;
    }

    public void setPolicyHolderSmokingStatus(String smoking)
    {
        policyHolderSmokingStatus = smoking;
    }

    public void setPolicyHolderHeight(int height)
    {
        policyHolderHeight = height;
    }

    public void setPolicyHolderWeight(int weight)
    {
        policyHolderWeight = weight;
    }

    public int getPolicyNumber()
    {
        return policyNumber;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public String getPolicyHolderFirstName()
    {
        return policyHolderFirstName;
    }

    public String getPolicyHolderLastName()
    {
        return policyHolderLastName;
    }

    public int getPolicyHolderAge()
    {
        return policyHolderAge;
    }

    public String getPolicyHolderSmokingStatus()
    {
        return policyHolderSmokingStatus;
    }

    public int getPolicyHolderHeight()
    {
        return policyHolderHeight;
    }

    public int getPolicyHolderWeight()
    {
        return policyHolderWeight;
    }

    public double calcBMI()
    {
        return (policyHolderWeight * 703)/(policyHolderHeight*policyHolderHeight);
    }
    
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
