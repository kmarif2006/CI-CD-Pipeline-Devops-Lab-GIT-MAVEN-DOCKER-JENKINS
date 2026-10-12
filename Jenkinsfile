pipeline{
    agent any

    stages{
        stage('Build and Test'){
            steps{ bat 'mvn clean package'}
        }
        stage('Docker Build'){
            steps{ bat 'docker build -t student-management:v1 .'}
        }
        stage('Docker Run'){
            steps{
                bat 'docker rm --force student-app || exit 0' 
                bat 'docker run -d -p 3000:8080 --name=student-app student-management:v1'
                }
        }
    }
}