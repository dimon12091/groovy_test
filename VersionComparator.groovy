
pipeline {
    agent {label 'master'}

    options {
      buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    stages {
        stage('Stage 1') {
            steps {
                echo 'Hello world!'
            }
        }
    }
}
app = ["1.20.1", "1.19.9-fix2", "1.19.9-fix", "1.19.20", "1.19.11", "1.19.10", "1.19.9"]
test = app[0].tokenize(".")[2].split("-")[0].toInteger()
println(test)
