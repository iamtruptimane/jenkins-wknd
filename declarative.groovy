pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                echo 'pull suceed'
            }
        }
        stage('Build') {
            steps {
                echo 'build is building'
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