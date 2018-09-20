# Continous Integeration
`docker build -t jenkins .`

# Run inside container

`docker run -p 8080:8080 -p 50000:50000 -v ~/Documents/workstation/devops_continous_integeration/jenkins_home:/var/jenkins_home -d jenkins:latest`

# Home Directory jenkins_home
Jenkins home directory is the home directory for Jenkins containing complete setup plugin, this folder is commited only for demo purpose and easy to load all installed plugin via container.
In real scenario, jenkins_home directory is suppose to be secure

# Credentails
username: admin
password: admin
