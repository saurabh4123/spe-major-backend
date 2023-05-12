pipeline {
     environment{
        dockerimage=""
        M2_HOME = '/opt/maven'
    }
    agent any
    stages {
        stage('Git clone') {
            steps {
            git branch: 'master',credentialsId:'github-cred',url: 'https://github.com/meetmandhanemnm/spe-major.git'
            }
        }
        stage("Running Test cases"){
            steps{
                sh "${M2_HOME}/bin/mvn clean test"
            }
        }         
        stage("Maven Build"){
            steps{
                sh "${M2_HOME}/bin/mvn clean install"
            }
        }

        stage('Docker Build Image') {
            steps {
                script{
                    dockerimage=docker.build "saurabh412/backendspe"
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','dockerhub'){
                    dockerimage.push()
                    }
                }
            }
        }

    }
}
