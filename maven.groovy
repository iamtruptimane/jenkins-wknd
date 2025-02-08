pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/iamtruptimane/student-app.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'test is going well'
            }
        }
        stage('Deploy') {
            steps {
                echo 'yahooo!!application deployed successfully'
            }
        }
    }
}