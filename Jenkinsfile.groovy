node {

    try {
        def mvnHome = tool "Maven"
        stage('Clone') {
            checkout scm

        }
        stage('Unit Test') {
            sh "mvn clean test"
            sh "ls -l target"
            def miaVar = "ecco la mia var"
            echo 'che cosa vedo? $miaVar'
            echo "che cosa vedo? $miaVar"
        }
        stage('Integration Test') {
            echo "qui dovrei lanciare i test di Integrazione"
        }
        stage('Build Artifact') {
            sh "mvn package"

        }
    } finally {
        junit 'target/surefire-reports/**/*.xml'
        sh "ls -al target"
        archiveArtifacts artifacts: 'target/goosegame-1.0-SNAPSHOT-jar-with-dependencies.jar', fingerprint: true
    }
}