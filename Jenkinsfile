pipeline {
    agent any
    stages {
          stage('log version info') {
               steps {
                    sh 'mvn --version'
                    sh 'mvn clean nstall'
                }
          }
     }

     post {
         always {
             cleanWs()
         }
     }
 }