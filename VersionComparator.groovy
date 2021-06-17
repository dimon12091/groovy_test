array = ["3.8.10","3.9.2","3.7.dublicate.5","3.9.1","1.17.5","1.17.5-alpine", "1.19.9-fix", "1.19.9-fix2"
]
    for(i=array.size()-1;i>1;i--){
        for(j=0;j<i;j++){
            if (array[j] == "<none>"){
                array.swap(j,j+1)
                continue
            }
            if ((array[j].tokenize('.')[2].size() > 2) && (array[j+1] != "<none>" ) ) {
                array.swap(j,j+1)
                continue
            }
            if((array[j] != "<none>") && (array[j+1] != "<none>") && (array[j][0..2]<array[j+1][0..2]) && (array[j+1].tokenize('.')[2].size() < 3 ) && (array[j].size() < 8 )){
                array.swap(j,j+1)
                continue
            }

println(array)
