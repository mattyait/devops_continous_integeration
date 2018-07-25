# Continous Integeration
`docker build -t jenkins .`

# Run inside container

`docker run -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home -d jenkins:latest`
