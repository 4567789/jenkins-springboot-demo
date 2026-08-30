pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Code récupéré depuis GitHub'
            }
        }

        stage('Build') {
            steps {
                echo 'Construction du projet...'
            }
        }

        stage('Test') {
            steps {
                echo 'Exécution des tests...'
            }
        }

        stage('Package') {
            steps {
                echo 'Création du JAR...'
            }
        }
    }

    post {
        success {
            echo 'Pipeline terminé avec succès !'
        }

        failure {
            echo 'Le pipeline a échoué.'
        }
    }
}