// Simulate job listings
const jobListings = [
    {
        title: "Software Engineer",
        salaryRange: "80k-100k",
        location: "New York",
        requiredSkills: ["Java", "Spring"],
        jobType: "Full-time"
    },
    {
        title: "Web Developer",
        salaryRange: "60k-80k",
        location: "Remote",
        requiredSkills: ["JavaScript", "React"],
        jobType: "Part-time"
    }
];

// Handle Profile Creation
document.getElementById('profileForm').addEventListener('submit', function (event) {
    event.preventDefault();

    const userName = document.getElementById('userName').value;
    const skills = document.getElementById('skills').value.split(',').map(skill => skill.trim());
    const resumeFile = document.getElementById('resume').files[0];
    const profilePhotoFile = document.getElementById('profilePhoto').files[0];

    // Simulate uploading the files and getting file paths (in real applications, you'd send them to a server)
    const resumePath = `uploads/${resumeFile.name}`;
    const profilePhotoPath = `uploads/${profilePhotoFile.name}`;

    // Save the profile (just logging to console for now)
    console.log('User Profile Created:', { userName, skills, resumePath, profilePhotoPath });

    alert('Profile created successfully!');
});
