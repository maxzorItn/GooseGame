node{
    def mvnHome = tool "Maven"
    stage('Clone'){
        checkout scm

    }
    stage('Unit Test'){
        sh "mvn clean test"
    }
    stage('Integration Test'){
       echo "qui dovrei lanciare i test di Integrazione"
    }
    stage('Results'){

    }
}