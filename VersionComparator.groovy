
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
app = ["1.9", "1.20.1", "1.19.9-fix2", "1.19.9-fix", "1.19.20", "1.19.11", "1.19.10", "1.19.9"]
for ( x in app) {

    if (x.tokenize(".")[2].length == 0) {
        println('hi')
    }
    if (x.tokenize(".")[2].length() == false) {
        println('hi1')
    }
    if (x.tokenize(".")[2].length() == true) {
        println('hi1')
    }
}



