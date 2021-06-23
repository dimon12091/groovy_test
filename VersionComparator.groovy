
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

    if (x.tokenize(".")[2].equals(null) == true) {
        println('hi')
    }
    if (x.tokenize(".")[2].equals(null)  == false) {
        println('hi1')
    }
}


test = ["1.9", "1.20.1"]
println(test.size())
println(app[2].tokenize(".")[1] == app[3].tokenize(".")[1])
println(app[2].tokenize(".")[2] == app[3].tokenize(".")[2])
