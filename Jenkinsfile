pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'test', branch: 'master', changelog: true, poll: true)
      }
    }
  }
}