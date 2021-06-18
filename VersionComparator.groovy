// array = ["3.8.10","3.9.2","3.7.dublicate.5","3.9.1","1.17.5","1.17.5-alpine","<none>", "1.19.9-fix", "1.19.9-fix2" , "1.13.tempCheckTaskComplete2"]
// for(i=array.size()-1;i>1;i--){
//                 for(j=0;j<i;j++){
//
//                     if (array[j] == "<none>"){
//                         array.swap(j,j+1)
//                         continue
//                     }
//
//                     if ( (array[j] != "<none>") && (array[j+1] != "<none>") && (array[j].tokenize('.')[2].size() > 2) ) {
//                         array.swap(j,j+1)
//                         continue
//                     }
//
//                     if ((array[j] != "<none>") && (array[j+1] != "<none>") && (array[j][0..3] < array[j+1][0..3]) && (array[j].size() < array[j+1].size() )){
//                         array.swap(j,j+1)
//                         continue
//                     }
//
//                     if ((array[j][0..3] == array[j+1][0..3]) && (array[j].size() < array[j+1].size() )){
//                         array.swap(j,j+1)
//                         continue
//                     }
//
//                     if((array[j] != "<none>") && (array[j+1] != "<none>") && (array[j][0..2]<array[j+1][0..2]) && (array[j+1].tokenize('.')[2].size() < 3 ) && (array[j].size() < 8 )){
//                         array.swap(j,j+1)
//                         continue
//                     }
//                 }
//             }
// println(array)

app = ["1.14.testDocumentExplorer8", "1.14.4", "1.14.4-alpine", "1.14.estate-for-web,"]
if (((app[0][0..2] >= app[1][0..2] ) || (app[0][0..2] <= app[1][0..2] ))  && (app[0].tokenize('.')[2] >  app[1].tokenize('.')[2])) {
    app.swap(0,1)

}
// println(app[1].tokenize('.')[2].getClass().getSimpleName())
// println(app[1].tokenize('.')[2] > app[0].tokenize('.')[2]) // false
// println(app[1].tokenize('.')[2] < app[0].tokenize('.')[2]) // true
// println(app[2].tokenize('.')[2])
// println(app[2].tokenize('.')[2].indexOf("b"))


test = ["1.17.1.mocked_rules_assignment", "1.19.8", "1.18.8", "1.18.9", "1.16.3.estate-for-web", "1.16.9"]
for(i=test.size()-1;i>1;i--){
    for(j=0;j<i;j++){
        println(test[j].tokenize('.')[3] != null)
        println("1.17" < "1.19")
        println(test[j][0..2])
        test[j+1][0..2]
//         if ((test[j][0..2] < test[j+1][0..2]) && (test[j].tokenize('.')[3]) != null) {
//             test.swap(j,j+1)
//             println(test[j].tokenize('.')[3])
//             println(test[j][0..2] < test[j+1][0..2])
//         }
    }
}
println(test)