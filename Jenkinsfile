pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing..'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying....'
         mail body: 'project build successful',
                     from: 'fourat.ferchichi@gmail.com',
                     replyTo: 'fourat.ferchichi@gmail.com',
                     subject: 'project build successful mother fucker' ,
                     to: 'fourat.ferchichi@gmail.com'
      }
    }
  }
}