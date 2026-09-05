pipeline {
    agent any

    stages {

        stage('Check Maven') {
            steps {
                bat 'where mvn'
                bat 'mvn -version'
            }
        }

        stage('Run prac1 Test') {
            steps {
                dir('stqa') {
                    bat 'mvn -Dtest=prac1 test'
                }
            }
        }
    }

    post {
        always {
            junit testResults: 'stqa/target/surefire-reports/*.xml',
                  allowEmptyResults: true
        }
    }
}
