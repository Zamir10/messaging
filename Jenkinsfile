pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'jdk8'
    }
    stages {
        stage('Tools') {
            steps {
                sh '''
                  echo "PATH = ${PATH}"
                  echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage ('Static Analyse') {
            steps {
                sh 'mvn pmd:check'
            }
        }
        stage ('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Deliver') {
            steps {
                sh './deliver.sh'
            }
        }
    }
}