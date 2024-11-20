import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class PolicyDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Read from a file
        File file = new File("src/PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        ArrayList<PolicyHolder> policyHolders = new ArrayList<PolicyHolder>();

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
            // instantiate Policy and PolicyHolder object
            Policy policy = new Policy(policyNumber, providerName);
            PolicyHolder holder = new PolicyHolder(policy, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
            policyHolders.add(holder); // Add policy object to the list

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

        for (int i = 0; i < policyHolders.size(); i++) {
            System.out.println(policyHolders.get(i)); // implicitly call toString
            System.out.println();
        }

        System.out.println("There were " + policyHolders.get(0).count + " Policy objects created.");

        System.out.println("The number of policies with a smoker is: " + numberOfSmokers);
        System.out.println("The number of policies with a non-smoker is: " + numberOfNonSmokers);
    }
}
