package com.mycompany.jobportal;

import java.util.List;

class UserProfile {
    String userName;
    List<String> skills;
    String resumePath;  // Path to the resume (Word or PDF)
    String profilePhotoPath;  // Path to the profile photo (PNG)

    // Constructor to initialize the user profile with photo and resume paths
    public UserProfile(String userName, List<String> skills, String resumePath, String profilePhotoPath) {
        this.userName = userName;
        this.skills = skills;
        this.resumePath = resumePath;
        this.profilePhotoPath = profilePhotoPath;
    }

    // Method to return a string representation of the user profile
    @Override
    public String toString() {
        return "User Profile{" +
                "userName='" + userName + '\'' +
                ", skills=" + skills +
                ", resumePath='" + resumePath + '\'' +
                ", profilePhotoPath='" + profilePhotoPath + '\'' +
                '}';
    }

    // Getter and setter methods for resumePath and profilePhotoPath
    public String getResumePath() {
        return resumePath;
    }

    public void setResumePath(String resumePath) {
        this.resumePath = resumePath;
    }

    public String getProfilePhotoPath() {
        return profilePhotoPath;
    }

    public void setProfilePhotoPath(String profilePhotoPath) {
        this.profilePhotoPath = profilePhotoPath;
    }
}
