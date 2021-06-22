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
println(app[1].tokenize(".")[2].split("-")[0])
println(app[2].tokenize(".")[2].split("-")[0])
println(app[2].tokenize(".")[2].indexOf("-") == 1)
println(app[0].tokenize('.')[2].indexOf("-") == -1)
// for(i=app.size()-1;i>1;i--){
//     for(j=0;j<i;j++){
//         if (app[j].tokenize('.')[2].indexOf("-") == 1) {
//             if ((app[j][0..3] == app[j+1][0..3]) && (app[j].tokenize(".")[2].split("-")[0].toInteger() <  app[j+1].tokenize(".")[2].split("-")[0].toInteger())) {
//                 app.swap(j,j+1)
//             }
//         }
//     }
// }
println(app)
// test = [ "1.20.2", "1.20.1", "1.19.9-fix2", "1.19.10-fix", "1.19.20", "1.19.11", "1.19.10", "1.19.9"]
// println(test[3].tokenize('.')[2].split("-"))
// println(test[0].matches("(?i).*[a-zа-я].*"))
// for(i=test.size()-1;i>1;i--){
//     for(j=0;j<i;j++){
//         if (test[j][0..3] == test[j+1][0..3] && test[j].tokenize('.')[2].matches("(?i).*[a-zа-я].*") == false &&  test[j].tokenize('.')[2].toInteger() < test[j+1].tokenize('.')[2].toInteger()){
//             test.swap(j,j+1)
//             continue
//
//         }
//         if ((test[j][0..3] == test[j+1][0..3]) && (test[j].tokenize('.')[2].indexOf('-') == 1) && (test[j+1].tokenize('.')[3] == null)){
//             if (test[j].tokenize('.')[2] < test[j+1].tokenize('.')[2]  ){
//                 test.swap(j,j+1)
//                 continue
//             }
//         }
//
//     }
// }
// println(test)