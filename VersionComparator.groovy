def array = ["3.8.10",
"3.9.2",
"3.9.1",
"3.8.3",
"3.8.2",
"2.7",
"2.7.1",
"3.8.1",
"3.7.4",
"3.7.3",
"3.6.5",
"3.6.4",
]

for (x in array) {
    def VALID_TOKENS = /._/
    x1 = x.tokenize(VALID_TOKENS)[2]
}

def bubbleSort(array) {
  for(i=array.size()-1;i>1;i--){
   for(j=0;j<i;j++){
   println(array[j])
    if(array[j]>array[j+1]){
     array.swap(j,j+1)
    }
   }
  }
}
bubbleSort(array)
println(array)



