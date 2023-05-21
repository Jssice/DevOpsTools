
pipeline {
    agent any
    // Add a tool configuration here...
    tools {
        maven 'Maven-3.9.2'
    }
    stages {
        stage('Compiling') {
            steps {
                git branch: 'main',
                changelog: false,
                poll: false,
                url: 'https://github.com/Jssice/DevOpsTools.git'
//                 sh:'./mvnw clean compile'
             }
        // stage('Cleaning') {
        //     steps {
        //         dir("${env.WORKSPACE}/src/test/java"){
        //             echo "Cleaning the workspace..."
        //             // Uncomment the following line after Maven is configured as a global tool
        //             // sh 'mvn clean'
        //         }
        //     }
        // }
        stage('Testing') {
            steps {
                dir("${env.WORKSPACE}/src/test/java"){
                    echo "Running tests..."
                    // Uncomment the following line after Maven is configured as a global tool
                    // sh 'mvn test'
                }
            }
        }
        stage('Creating deployable package/executable') {
            steps {
                dir("${env.WORKSPACE}/src/test/java"){
                    echo "Creating the JAR file..."
                    // Uncomment the following line after Maven is configured as a global tool
                    // sh 'mvn package -DskipTests'
                }
            }
        }
    }
    post {
        always {
            echo "Collecting jUnit test results..."
            // Add jUnit report collection here...
            //junit allowEmptyResults: true, 
                //testResults: '**/TEST-com.learningjenkins.AppTest.xml'
            junit(testResults: '**.surefire-reports/**/*.xml')    
            echo "Archiving the JAR file..."
            // Add artifact archiving here...
            archiveArtifacts allowEmptyArchive: true, 
                artifacts: '**/hello-1.0-SNAPSHOP.jar', 
                fingerprint: true, 
                followSymlinks: false, 
                onlyIfSuccessful: true        }
    }
}
