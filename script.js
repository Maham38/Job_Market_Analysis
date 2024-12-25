document .getElementById('profile-form').addEventListener('submit', function(event) {
    event.preventDefault();

    // Get form values
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const resumeFile = document.getElementById('resume').files[0];
    const photoFile = document.getElementById('profile-photo').files[0];

    // Create object URLs for the uploaded files
    const resumeUrl = URL.createObjectURL(resumeFile);
    const photoUrl = URL.createObjectURL(photoFile);

    // Display profile details
    document.getElementById('display-name').innerText = name;
    document.getElementById('display-email').innerText = email;
    document.getElementById('display-resume').href = resumeUrl;
    document.getElementById('display-photo').src = photoUrl;

    // Show profile display and hide form
    document.getElementById('profile-display').classList.remove('hidden');
    document.getElementById('profile-form').classList.add('hidden');
    document.getElementById('form-title').innerText = 'Edit Profile';

    // Add event listener for the edit button
    document.getElementById('edit-button').addEventListener('click', function() {
        // Hide profile display and show form
        document.getElementById('profile-display').classList.add('hidden');
        document.getElementById('profile-form').classList.remove('hidden');
        document.getElementById('form-title').innerText = 'Create Profile';

        // Reset form fields
        document.getElementById('profile-form').reset();
    });
});

document.getElementById('job-filter-form').addEventListener('submit', function(event) {
    event.preventDefault();

    // Get filter values
    const jobTitle = document.getElementById('job-title').value;
    const location = document.getElementById('location').value;
    const jobType = document.getElementById('job-type').value;

    // Create a job listing based on filters
    const jobList = document.getElementById('job-list');
    jobList.innerHTML = ''; // Clear previous results

    // Example job data (in a real application, this would come from a database or API)
    const jobs = [
        { title: 'Software Engineer', location: 'New York', type: 'full-time' },
        { title: 'Web Developer', location: 'San Francisco', type: 'part-time' },
        { title: 'Project Manager', location: 'Remote', type: 'contract' },
    ];

    // Filter jobs based on user input
    const filteredJobs = jobs.filter(job => {
        return (!jobTitle || job.title.toLowerCase().includes(jobTitle.toLowerCase())) &&
               (!location || job.location.toLowerCase().includes(location.toLowerCase())) &&
               (!jobType || job.type === jobType);
    });

    // Display filtered jobs
    filteredJobs.forEach(job => {
        const li = document.createElement('li');
        li.textContent = `${job.title} - ${job.location} (${job.type})`;
        jobList.appendChild(li);
    });

    // Show filtered jobs section
    document.getElementById('filtered-jobs').classList.remove('hidden');
});