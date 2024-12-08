
package com.mycompany.jobportal;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class JobPortal {
    private List<UserProfile> userProfiles = new ArrayList<>();
    private List<Job> jobListings = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    public JobPortal() {
        // Sample job listings
        jobListings.add(new Job("Software Engineer", "80k-100k", "New York", Arrays.asList("Java", "Spring"), "Full-time"));
        jobListings.add(new Job("Web Developer", "60k-80k", "Remote", Arrays.asList("JavaScript", "React"), "Part-time"));
    }

    public void start() {
        while (true) {
            System.out.println("Welcome to the Job Portal!");
            System.out.println("1. Create User Profile");
            System.out.println("2. View Job Listings");
            System.out.println("3. Filter Jobs");
            System.out.println("4. Exit");

            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    createUserProfile();
                    break;
                case 2:
                    viewJobListings();
                    break;
                case 3:
                    filterJobs();
                    break;
                case 4:
                    System.out.println("Exiting the application...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void createUserProfile() {
        System.out.println("\n--- Create User Profile ---");

        System.out.print("Enter your username: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your skills (comma separated): ");
        String skillsInput = scanner.nextLine();
        List<String> skills = Arrays.asList(skillsInput.split(","));

        System.out.print("Enter the path to your resume: ");
        String resume = scanner.nextLine();

        System.out.print("Enter the path to your profile photo: ");
        String profilePhoto = scanner.nextLine();

        UserProfile userProfile = new UserProfile(userName, skills, resume, profilePhoto);
        userProfiles.add(userProfile);

        System.out.println("\nProfile created successfully!\n");
    }

    private void viewJobListings() {
        System.out.println("\n--- Job Listings ---");

        if (jobListings.isEmpty()) {
            System.out.println("No job listings available.");
            return;
        }

        for (Job job : jobListings) {
            System.out.println(job);
        }

        System.out.println();
    }

    private void filterJobs() {
        System.out.println("\n--- Filter Jobs ---");

        System.out.print("Enter desired salary range (e.g., 80k-100k): ");
        String salaryRange = scanner.nextLine();

        System.out.print("Enter desired location: ");
        String location = scanner.nextLine();

        System.out.print("Enter desired job type (e.g., Full-time, Part-time): ");
        String jobType = scanner.nextLine();

        System.out.println("\nFiltered Job Listings:");

        for (Job job : jobListings) {
            boolean matchesSalary = salaryRange.isEmpty() || job.salaryRange.equalsIgnoreCase(salaryRange);
            boolean matchesLocation = location.isEmpty() || job.location.equalsIgnoreCase(location);
            boolean matchesJobType = jobType.isEmpty() || job.jobType.equalsIgnoreCase(jobType);

            if (matchesSalary && matchesLocation && matchesJobType) {
                System.out.println(job);
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        JobPortal jobPortal = new JobPortal();
        jobPortal.start();
    }
}

