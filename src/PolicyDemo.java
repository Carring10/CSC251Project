import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class PolicyDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Read from a file
        File file = new File("src/PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        ArrayList<Policy> policies = new ArrayList<>();

        // Attributes
        int policyNumber;
        String providerName;
        String policyHolderFirstName;
        String policyHolderLastName;
        int policyHolderAge;
        String policyHolderSmokingStatus;
        double policyHolderHeight;
        double policyHolderWeight;

        int numberOfSmokers = 0;
        int numberOfNonSmokers = 0;

        // Process the file as long as it has not come to an end
        while(inputFile.hasNext()) {
            policyNumber = inputFile.nextInt();
            inputFile.nextLine(); // Clear line
            providerName = inputFile.nextLine();
            policyHolderFirstName = inputFile.nextLine();
            policyHolderLastName = inputFile.nextLine();
            policyHolderAge = inputFile.nextInt();
            inputFile.nextLine(); // Clear line
            policyHolderSmokingStatus = inputFile.nextLine();
            policyHolderHeight = inputFile.nextDouble();
            inputFile.nextLine(); // Clear line
            policyHolderWeight = inputFile.nextDouble();
            inputFile.nextLine(); // Clear line


            // @param policyNumber, providerName, policyHolderFirstName, policyHolderLastName,policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight
            Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName,policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
            policies.add(policy); // Add policy object to the list

            // Accumulate number of smokers and non-smokers
            if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) {
                numberOfSmokers++;
            } else numberOfNonSmokers++;

            // Skip blank line between policies if it exists
            if (inputFile.hasNextLine()) {
                inputFile.nextLine();
            }
        }

        inputFile.close();

        for (Policy policy : policies) {
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getPolicyHolderFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getPolicyHolderLastName());
            System.out.println("Policyholder's Age: " + policy.getPolicyHolderAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getPolicyHolderHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getPolicyHolderWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI(policy.getPolicyHolderHeight(), policy.getPolicyHolderWeight()));
            System.out.printf("Policy Price: $%.2f%n", policy.calculateInsurancePolicy(policy.getPolicyHolderAge(), policy.getPolicyHolderSmokingStatus(), policy.getPolicyHolderHeight(), policy.getPolicyHolderWeight()));
            System.out.println();
        }

        System.out.println("The number of policies with a smoker is: " + numberOfSmokers);
        System.out.println("The number of policies with a non-smoker is: " + numberOfNonSmokers);
    }
}
