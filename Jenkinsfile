node {

  checkout scm
  
  stage('Build') { 
         steps {
                sh 'mvn clean compile install' 
            }
        }
  
  def dockerImage
  


  stage('Build image') {
    dockerImage = docker.build("vsramakrishnaraju/latest:version1")
  }

  stage('Push image') {
    dockerImage.push()
  }   

}
