def array = ["3.8.10","3.9.2","3.9.1","3.8.3","3.8.2","2.7.2","2.7.1","3.8.1","3.7.4","3.7.3","3.6.5","3.6.4"]
def bubbleSort(array) {
  for(i=array.size()-1;i>1;i--){
   for(j=0;j<i;j++){
    def VALID_TOKENS = /._/
    b = array[j].tokenize(VALID_TOKENS)[2]
    c = array[j+1].tokenize(VALID_TOKENS)[2]
    if (array[j][0..2] == array[j+1][0..2] && b > c) {
        println( b, ">" ,c)
        array.swap(j,j+1)
        continue
    }
    if(array[j]>array[j+1]){
        array.swap(j,j+1)
    }
   }
  }
}
bubbleSort(array)
println(array)
