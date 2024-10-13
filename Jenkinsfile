pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/umuttig37/TimeCalculator.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Code Coverage') {
            steps {
                jacoco execPattern: 'target/**/*.exec'
            }
        }
    }

    post {
        always {
            junit '/target/surefire-reports/*.xml'
            jacoco execPattern: 'target/**/*.exec'
        }
    }
}