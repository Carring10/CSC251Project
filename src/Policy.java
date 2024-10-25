public class Policy {
    // Attributes
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private int policyHolderWeight;

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
    public Policy(int number, String provider, String firstName, String lastName, int age, String smokingStatus, double height, int weight) {
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
    public void setPolicyNumber(int number) {
        policyNumber = number;
    }

    public void setProviderName(String provider) {
        providerName = provider;
    }

    public void setPolicyHolderFirstName(String firstName) {
        policyHolderFirstName = firstName;
    }

    public void setPolicyHolderLastName(String lastName) {
        policyHolderLastName = lastName;
    }

    public void setPolicyHolderAge(int age) {
        policyHolderAge = age;
    }

    public void setPolicyHolderSmokingStatus(String smokingStatus) {
        policyHolderSmokingStatus = smokingStatus;
    }

    public void setPolicyHolderHeight(double height) {
        policyHolderHeight = height;
    }

    public void setPolicyHolderWeight(int weight) {
        policyHolderWeight = weight;
    }

    // Getter Methods
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    public String getPolicyHolderSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    public double getPolicyHolderHeight() {
        return policyHolderHeight;
    }

    public int getPolicyHolderWeight() {
        return policyHolderWeight;
    }

    // Method for calculating policyholder's BMI
    public double calculateBMI(double policyHolderHeight, int policyHolderWeight) {
        return (policyHolderWeight * 703) / (Math.pow(policyHolderHeight, 2));
    }

    // Method that calculates and returns the price of insurance policy
    public double calculateInsurancePolicy(int policyHolderAge, String policyHolderSmokingStatus, double policyHolderHeight, int policyHolderWeight) {
        int insuranceBaseFee = 600;

        if (policyHolderAge > 50) {
            insuranceBaseFee += 75; // If policyholder is over 50, add 75 to fee
        }

        if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) {
            insuranceBaseFee += 100; // If policyholder is a smoker, add 100 to fee
        }

        if (calculateBMI(policyHolderHeight, policyHolderWeight) > 35) {
            insuranceBaseFee += (int) (calculateBMI(policyHolderHeight, policyHolderWeight) - 35 * 20);
        }

        return insuranceBaseFee;
    }
}