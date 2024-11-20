public class PolicyHolder {
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

    // No arg constructor
    public PolicyHolder() {
        policyHolderFirstName = "Jane";
        policyHolderLastName = "Doe";
        policyHolderAge = 0;
        policyHolderSmokingStatus = "non-smoker";
        policyHolderHeight = 0;
        policyHolderWeight = 0;
    }

    // Constructor that accepts arguments
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        policyHolderFirstName = firstName;
        policyHolderLastName = lastName;
        policyHolderAge = age;
        policyHolderSmokingStatus = smokingStatus;
        policyHolderHeight = height;
        policyHolderWeight = weight;
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

    public String toString() {
        return String.format("\nPolicyholder's First Name: " + getPolicyHolderFirstName() +
                "\nPolicyholder's Last Name: " + getPolicyHolderLastName() +
                "\nPolicyholder's Age: " + getPolicyHolderAge() +
                "\nPolicyholder's Smoking Status: " + getPolicyHolderSmokingStatus() +
                "\nPolicyholder's Height: " + getPolicyHolderHeight() + " inches" +
                "\nPolicyholder's Weight: " + getPolicyHolderWeight() + " pounds" +
                "\nPolicyholder's BMI: %.2f%n", calculateBMI(getPolicyHolderHeight(), getPolicyHolderWeight())) +
                "\nPolicy Price: $%.2f%n" + calculateInsurancePolicy(getPolicyHolderAge(), getPolicyHolderSmokingStatus(), getPolicyHolderHeight(), getPolicyHolderWeight());
    }
}
