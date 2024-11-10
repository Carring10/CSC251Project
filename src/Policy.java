public class Policy {
    // Attributes
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

   // No arg constructor, default's for all fields
    public Policy() {
        policyNumber = 1;
        providerName = "None";
        policyHolderFirstName = "Jane";
        policyHolderLastName = "Doe";
        policyHolderAge = 25;
        policyHolderSmokingStatus = "non-smoker";
        policyHolderHeight = 5.3;
        policyHolderWeight = 110;
    }

    // Constructor that accepts arguments
    public Policy(int number, String provider, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        policyNumber = number;
        providerName = provider;
        policyHolderFirstName = firstName;
        policyHolderLastName = lastName;
        policyHolderAge = age;
        policyHolderSmokingStatus = smokingStatus;
        policyHolderHeight = height;
        policyHolderWeight = weight;
    }

    // Setter methods
    // @param number - policy number
    public void setPolicyNumber(int number) {
        policyNumber = number;
    }

    // @param provider - the provider's name
    public void setProviderName(String provider) {
        providerName = provider;
    }

    // @param firstName - the policyholder's first name
    public void setPolicyHolderFirstName(String firstName) {
        policyHolderFirstName = firstName;
    }

    // @param lastName - the policyholder's last name
    public void setPolicyHolderLastName(String lastName) {
        policyHolderLastName = lastName;
    }

    // @param age - the policyholder's age
    public void setPolicyHolderAge(int age) {
        policyHolderAge = age;
    }

    // @param smokingStatus - the policyholder's smoking status
    public void setPolicyHolderSmokingStatus(String smokingStatus) {
        policyHolderSmokingStatus = smokingStatus;
    }

    // @param height - the policyholder's height
    public void setPolicyHolderHeight(double height) {
        policyHolderHeight = height;
    }

    // @param weight - the policyholder's weight
    public void setPolicyHolderWeight(double weight) {
        policyHolderWeight = weight;
    }

    // Getter Methods
    // @return policyNumber - the policy number
    public int getPolicyNumber() {
        return policyNumber;
    }

    // @return providerName - the provider's name
    public String getProviderName() {
        return providerName;
    }

    // @return policyHolderFirstName - the policyholder's first name
    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    // @return policyHolderLastName - the policyholder's last name
    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    // @return policyHolderAge - the policyholder's age
    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    // @return policyHolderSmokingStatus - the policyholder's smoking status
    public String getPolicyHolderSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    // @return policyHolderHeight - the policyholder's height
    public double getPolicyHolderHeight() {
        return policyHolderHeight;
    }

    // @return policyHolderWeight - the policyholder's weight
    public double getPolicyHolderWeight() {
        return policyHolderWeight;
    }

    // Method for calculating policyholder's BMI
    // @return the calculated BMI of the policyholder
    public double calculateBMI(double policyHolderHeight, double policyHolderWeight) {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    // Method that calculates and returns the price of insurance policy
    // @param policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight
    // @return calculate the insurance policy cost based on BMI and smoking status
    public double calculateInsurancePolicy(int policyHolderAge, String policyHolderSmokingStatus, double policyHolderHeight, double policyHolderWeight) {
        double insuranceBaseFee = 600;
        double bmi = calculateBMI(policyHolderHeight, policyHolderWeight);

        if (policyHolderAge > 50) {
            insuranceBaseFee += 75; // If policyholder is over 50, add 75 to fee
        }

        if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) {
            insuranceBaseFee += 100; // If policyholder is a smoker, add 100 to fee
        }

        if (bmi > 35) {
            insuranceBaseFee += (bmi - 35) * 20;
        }

        return insuranceBaseFee;
    }
}