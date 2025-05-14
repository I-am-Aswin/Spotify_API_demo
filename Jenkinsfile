pipeline {
    agent { docker { image 'maven' } }

    stages {
        stage ( "Compile" ) {
            steps {
                sh "mvn compile"
            }
        }

        stage("Build") {
            steps {
                sh "mvn clean package"

            }
        }

        stage("Test") {
            steps {
                sh "mvn test"
            }
        }
    }
}