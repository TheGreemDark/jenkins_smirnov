pipeline {
    agent any

    stages {
        stage('System info') {
            steps {
                sh '''
                    echo "Disk usage"
                    df -h

                    echo
                    echo "Top memory process"
                    ps aux --sort=-rss | head -n 2
                '''
            }
        }
    }
}
