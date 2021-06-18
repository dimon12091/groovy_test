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


test = [ "1.19.8", "1.18.8", "1.18.9", "1.19.23"]
println(test[-1].tokenize('.')[2])
for(i=test.size()-1;i>1;i--){
    for(j=0;j<i;j++){
        if ((test[j][0..3] < test[j+1][0..3]) && (test[j].tokenize('.')[2] > test[j+1].tokenize('.')[2])){
            test.swap(j,j+1)
            continue
        }
    }
}
println(test)
