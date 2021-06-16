array = ["3.8.10","3.9.2","3.9.1","3.8.3","3.8.2","2.7.2","2.7.1","3.8.1","3.7.4","3.7.3","3.6.5","3.6.4", "1.19.9-fix", "1.19.9-fix2", "<none>"]

  for(i=array.size()-1;i>1;i--){
   for(j=0;j<i;j++){
    b = array[j].tokenize('.')[2]
    c = array[j+1].tokenize('.')[2]
    if (array[j] = "<none>") {
        array.swap(-1, 0)
    }
    if ((array[j][0..2] == array[j+1][0..2] && b > c) || (array[j][0..2] == array[j+1][0..2] && b < c)) {
        array.swap(j,j+1)
        continue
    }
    if(array[j][0..2]>array[j+1][0..2]){
        array.swap(j,j+1)
    }
   }
  }


println(array)
