pipeline {
    agent any

    stages {

        stage('Run prac1 Test') {
            steps {
                dir('stqa') {
                    bat 'mvn clean test -Dtest=testng1'
                }
            }
        }
    }

    post {
        always {
            junit testResults: 'stqa/target/surefire-reports/*.xml',
                  allowEmptyResults: false
        }
    }
}
