 public class PolicyHolder
{   
   //Declare fields for policy holder information
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private String policyHolderAge;
    private String policyHolderSmokingStatus;
    private String policyHolderHeight;
    private String policyHolderWeight;
       
    //Constructor that initializes all string fields to ""
    public PolicyHolder()
    {
        policyHolderFirstName = "";
        policyHolderLastName = "";
        policyHolderAge = "";
        policyHolderSmokingStatus = "";
        policyHolderHeight = "";
        policyHolderWeight = "";
    }
    
    /*
    Constructor that initializes all fields with policy holder information from user input 
    @param firstName String variable that holds the first name of the policyholder
    @param lastName String variable that holds the last name of the policyholder
    @param age int variable that holds the age of the policyholder
    @param smoking String variable that holds rather or not the policyholder is a smoker
    @param height double variable that holds the height of the policyholder
    @param weight double variable that holds the weight of the policyholder 
    */
    public PolicyHolder(String firstName, String lastName, String age, String smoking, String height, String weight)
    {
        policyHolderFirstName = firstName;
        policyHolderLastName = lastName;
        policyHolderAge = age;
        policyHolderSmokingStatus = smoking;
        policyHolderHeight = height;
        policyHolderWeight = weight;
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
    public void setPolicyHolderAge(String age)
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
    public void setPolicyHolderHeight(String height)
    {
        policyHolderHeight = height;
    }
    
    /*
    Setter for the policyholder's weight
    @param weight double variable that holds the weight of the policyholder
    */
    public void setPolicyHolderWeight(String weight)
    {
        policyHolderWeight = weight;
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
    Getter for policyholder's age
    @return policyholder's age
    */
    public String getPolicyHolderAge()
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
    public String getPolicyHolderHeight()
    {
        return policyHolderHeight;
    }
    
    /*
    Getter for policyholder's weight
    @return policyholder's weight
    */
    public String getPolicyHolderWeight()
    {
        return policyHolderWeight;
    }
}
