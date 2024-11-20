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
}
