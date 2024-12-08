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
    const resume = document.getElementById('resume').value;
    const profilePhoto = document.getElementById('profilePhoto').value;

    // Save the profile (just logging to console for now)
    console.log('User Profile Created:', { userName, skills, resume, profilePhoto });

    alert('Profile created successfully!');
});

// Handle Job Filtering
document.getElementById('jobFilterForm').addEventListener('submit', function (event) {
    event.preventDefault();

    const salaryRange = document.getElementById('salaryRange').value;
    const location = document.getElementById('location').value;
    const jobType = document.getElementById('jobType').value;

    const filteredJobs = jobListings.filter(job => {
        return (!salaryRange || job.salaryRange.includes(salaryRange)) &&
               (!location || job.location.includes(location)) &&
               (!jobType || job.jobType.includes(jobType));
    });

    displayJobs(filteredJobs);
});

// Display filtered jobs
function displayJobs(jobs) {
    const jobResultsContainer = document.getElementById('jobResults');
    jobResultsContainer.innerHTML = '';

    if (jobs.length === 0) {
        jobResultsContainer.innerHTML = '<p>No jobs found.</p>';
        return;
    }

    jobs.forEach(job => {
        const jobElement = document.createElement('div');
        jobElement.classList.add('jobItem');
        jobElement.innerHTML = `
            <h3>${job.title}</h3>
            <p>Salary: ${job.salaryRange}</p>
            <p>Location: ${job.location}</p>
            <p>Job Type: ${job.jobType}</p>
            <p>Skills Required: ${job.requiredSkills.join(', ')}</p>
        `;
        jobResultsContainer.appendChild(jobElement);
    });
}
