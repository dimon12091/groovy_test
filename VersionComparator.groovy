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


test = ["1.17.1.mocked_rules_assignment", "1.19.8", "1.18.8", "1.18.9", "1.16.3.estate-for-web", "1.16.9", "1.4"]
println(test[-1].tokenize('.')[2])
for(i=test.size()-1;i>1;i--){
    for(j=0;j<i;j++){
        if(test[j][0..3] == true){
//             if ((test[j][0..3] < test[j+1][0..3]) && (test[j].tokenize('.')[3]) != null) {
//                 test.swap(j,j+1)
//             }
                if (test[j][0..3] == true){
                    if (((test[j][0..3] >= test[j+1][0..3] ) || (test[j][0..3] <= test[j+1][0..3] ))  && (test[j].tokenize('.')[2] >  test[j+1].tokenize('.')[2]) && (test[j+1] != "<none>")) {
                        test.swap(j,j+1)
                        continue
                    }
                }
        }
    }
}

println(test)
