node {
    stage('pull') {
        echo 'pull suceed'
    }
    stage('Build') {
        echo 'build is building'
    }
    stage('Test') {
        echo 'test is going well'
    }
    stage('Deploy') {
        echo 'yahooo!!application deployed successfully'
    }
}