import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Attributes
        int policyNumber;
        String providerName;
        String policyHolderFirstName;
        String policyHolderLastName;
        int policyHolderAge;
        String policyHolderSmokingStatus;
        double policyHolderHeight;
        double policyHolderWeight;

        System.out.println("Please enter the Policy Number: ");
        policyNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the Provider Name: ");
        providerName = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s First Name: ");
        policyHolderFirstName = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Last Name: ");
        policyHolderLastName = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Age: ");
        policyHolderAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        policyHolderSmokingStatus = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Height (in inches): ");
        policyHolderHeight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
        policyHolderWeight = scanner.nextDouble();
        scanner.nextLine();

        Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName,policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getPolicyHolderFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getPolicyHolderLastName());
        System.out.println("Policyholder's Age: " + policy.getPolicyHolderAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getPolicyHolderHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getPolicyHolderWeight() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI(policyHolderHeight, policyHolderWeight));
        System.out.printf("Policy Price: $%.2f%n", policy.calculateInsurancePolicy(policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight));
    }
}
