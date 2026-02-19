pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/raviranjan-code/studentapp.git'

            }
        }

        stage('Build') {
            steps {
                sh './mvnw clean package'
            }
        }

        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }

    }
}
