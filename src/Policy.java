public class Policy {
    // Attributes
    private int policyNumber;
    private String providerName;

    public static int count = 0; // To hold number of Policies

   // No arg constructor, default's for all fields
    public Policy() {
        policyNumber = 0;
        providerName = "None";
        count++;
    }

    // Constructor that accepts arguments
    public Policy(int number, String provider) {
        policyNumber = number;
        providerName = provider;
        count++;
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

    public String toString() {
        return "\nPolicy Number: " + getPolicyNumber() +
                "\nProvider Name: " + getProviderName();
    }
}