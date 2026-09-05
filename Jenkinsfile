pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Check Maven') {
            steps {
                bat 'where mvn'
                bat 'mvn -version'
            }
        }

        stage('Run prac1 Test') {
            steps {
                bat 'mvn -Dtest=prac1 test'
            }
        }
    }

    post {
        always {
            junit testResults: '**/target/surefire-reports/*.xml',
                  allowEmptyResults: true
        }
    }
}
