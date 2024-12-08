/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobportal;

import java.util.List;



class Job {
    String title;
    String salaryRange;
    String location;
    List<String> requiredSkills;
    String jobType;

    public Job(String title, String salaryRange, String location, List<String> requiredSkills, String jobType) {
        this.title = title;
        this.salaryRange = salaryRange;
        this.location = location;
        this.requiredSkills = requiredSkills;
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", salaryRange='" + salaryRange + '\'' +
                ", location='" + location + '\'' +
                ", requiredSkills=" + requiredSkills +
                ", jobType='" + jobType + '\'' +
                '}';
    }
}

