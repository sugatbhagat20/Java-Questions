//Question:
//You are tasked with developing a Java-based system that allows users to store and retrieve insurance policy details.
//
//The program should accept n policy details from the user, where each policy has a unique policyId and a policyName.
//The policy details should be stored in a TreeMap<Integer, String> where the key is policyId and the value is policyName.
//Implement a method addPolicyDetails(int policyId, String policyName) that adds policy details to the map.
//Implement a method searchBasedOnPolicyType(String policyType) that searches for policies containing the given policy type 
//in their names and returns a list of matching policyIds.
//Finally, display all stored policies in sorted order based on policyId, and allow the user to search for policies by entering 
//a policyType.
package com.collections;


import java.util.*;

class PolicyDetails {
    private TreeMap<Integer, String> policyMap;

    public PolicyDetails() {
        policyMap = new TreeMap<>();
    }

    public void addPolicyDetails(int policyId, String policyName) {
        policyMap.put(policyId, policyName);
    }

    public List<Integer> searchBasedOnPolicyType(String policyType) {
        List<Integer> matchingPolicyIds = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : policyMap.entrySet()) {
            if (entry.getValue().toLowerCase().contains(policyType.toLowerCase())) {
                matchingPolicyIds.add(entry.getKey());
            }
        }
        return matchingPolicyIds;
    }

    public void displayAllPolicies() {
        System.out.println("Stored Policies (Sorted by Policy ID):");
        for (Map.Entry<Integer, String> entry : policyMap.entrySet()) {
            System.out.println("Policy ID: " + entry.getKey() + ", Policy Name: " + entry.getValue());
        }
    }
}

public class InsurancePolicyManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PolicyDetails policyDetails = new PolicyDetails();

        System.out.print("Enter the number of policies: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Policy ID: ");
            int policyId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Policy Name: ");
            String policyName = scanner.nextLine();
            policyDetails.addPolicyDetails(policyId, policyName);
        }

        policyDetails.displayAllPolicies();

        
        System.out.print("\nEnter a policy type to search: ");
        String policyType = scanner.nextLine();
        List<Integer> matchingPolicies = policyDetails.searchBasedOnPolicyType(policyType);

        if (matchingPolicies.isEmpty()) {
            System.out.println("No matching policies found.");
        } else {
            System.out.println("Matching Policy IDs: " + matchingPolicies);
        }
        
        scanner.close();
    }
}
