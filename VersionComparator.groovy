// array = ["3.8.10","3.9.2","3.7.dublicate.5","3.9.1","1.17.5","1.17.5-alpine","<none>", "1.19.9-fix", "1.19.9-fix2" , "1.13.tempCheckTaskComplete2"]
// for(i=array.size()-1;i>1;i--){
//                 for(j=0;j<i;j++){
//
//
//
//                 }
//             }
// println(array)
// println(app[1].tokenize('.')[2].getClass().getSimpleName())
// println(app[1].tokenize('.')[2] > app[0].tokenize('.')[2]) // false
// println(app[1].tokenize('.')[2] < app[0].tokenize('.')[2]) // true
// println(app[2].tokenize('.')[2])
// println(app[2].tokenize('.')[2].indexOf("b"))

println(test)

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

test = [ "1.19.23","1.18.1-hotfix2","1.19.5", "1.19.testDocumentExplorer8","1.19.1-hotfix", "1.19.22"]
println(test[-2].tokenize('.')[2].indexOf('-'))
println(test.getClass().getSimpleName())
// println(test[3].matches("(?i).*[a-zа-я].*"))
// for(i=test.size()-1;i>1;i--){
//     for(j=0;j<i;j++){
//         println(test)
//         if ((test[j].tokenize('.')[2].indexOf('-') != 1) && (test[j+1].tokenize('.')[2].indexOf('-') != 1)) {
//             if ((test[j][0..3] <= test[j+1][0..3]) && (test[j].tokenize('.')[2].toInteger() < test[j+1].tokenize('.')[2].toInteger())){
//                 test.swap(j,j+1)
//             }
//         }
//     }
// }
