// Lives at the repo root as "Jenkinsfile" — Multibranch Pipeline runs
// whichever branch's copy of this file when you build that branch.

pipeline {
    agent any

    tools {
        maven 'Maven3' // must match the name you gave it in Manage Jenkins → Tools
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Store the jar') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
