pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello User'
            }
        }
        stage('Name') {
            steps {
                echo 'MOULIRAJ E'
            }
        }
        stage('College') {
            steps {
                echo 'KEC'
            }
        }
        stage('Departement') {
            steps {
                echo 'CSE'
            }
        }
        stage('Year') {
            steps {
                echo 'II'
            }
        }
    }
}
