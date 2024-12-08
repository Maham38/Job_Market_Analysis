/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobportal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class UserProfile {
    String userName;
    List<String> skills;
    String resume;
    String profilePhoto;

    public UserProfile(String userName, List<String> skills, String resume, String profilePhoto) {
        this.userName = userName;
        this.skills = skills;
        this.resume = resume;
        this.profilePhoto = profilePhoto;
    }

    @Override
    public String toString() {
        return "User Profile{" +
                "userName='" + userName + '\'' +
                ", skills=" + skills +
                ", resume='" + resume + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                '}';
    }
}
