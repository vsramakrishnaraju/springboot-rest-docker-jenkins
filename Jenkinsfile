node {

  checkout scm
  def dockerImage

  stage('Build image') {
    dockerImage = docker.build("vsramakrishnaraju/latest:version1")
  }

  stage('Push image') {
    dockerImage.push()
  }   

}
