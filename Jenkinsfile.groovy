pipeline{
    agent any
    stages{
        stages("Run Command"){
            steps{
                sh "echo Hello"
            }
        }
    }
}