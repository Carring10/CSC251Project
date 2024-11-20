public class Policy {
    // Attributes
    private int policyNumber;
    private String providerName;

   // No arg constructor, default's for all fields
    public Policy() {
        policyNumber = 1;
        providerName = "None";
    }

    // Constructor that accepts arguments
    public Policy(int number, String provider) {
        policyNumber = number;
        providerName = provider;
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

    // Getter Methods
    // @return policyNumber - the policy number
    public int getPolicyNumber() {
        return policyNumber;
    }

    // @return providerName - the provider's name
    public String getProviderName() {
        return providerName;
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