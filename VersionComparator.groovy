array = ["3.8.10","3.9.2","3.7.dublicate.5","3.9.1","3.8.3","3.8.2","2.7.2","2.7.1","3.8.1","3.7.4","3.7.3","3.6.5","3.6.4", "<none>", "1.19.9-fix", "1.19.9-fix2"
]


  for(i=array.size()-1;i>1;i--){
   for(j=0;j<i;j++){
   if (array[j+1] == "<none>" ){
    array.swap(j,j+1)
   }
    b = array[j].tokenize('.')[2]
    c = array[j+1].tokenize('.')[2]
    println(b.size())
    if ((array[j][0..2] == array[j+1][0..2] && b > c) || (array[j][0..2] == array[j+1][0..2] && b < c) || (b.size() > 2 || c.size() > 2 )) {
        array.swap(j,j+1)
        continue
    }
    if(array[j][0..2]>array[j+1][0..2]){
        array.swap(j,j+1)
    }
   }
  }


println(array)

list = ["<none>", "bash"]
if (list[0] == "<none>") {
    println(list[0])
}
else (
    println("you are stupid")
)