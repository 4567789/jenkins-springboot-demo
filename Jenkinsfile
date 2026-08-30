pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Construction du projet...'
                sh './mvnw clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Exécution des tests...'
                sh './mvnw test'
            }
        }

        stage('Package') {
            steps {
                echo 'Création du JAR...'
                sh './mvnw package -DskipTests'
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