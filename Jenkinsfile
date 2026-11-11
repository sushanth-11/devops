
pipeline {
    agent any
    triggers { githubPush() }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'javac -version'
                bat 'javac App.java AppTest.java'
                bat 'java App'
            }
        }

        stage('Test') {
            steps {
                bat 'java AppTest'
            }
        }
    }

    post {
        success { echo 'Build stable' }
        failure { echo 'Build failed' }
    }
}
