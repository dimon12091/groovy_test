def array = ["3.8.10","3.9.2","3.9.1","3.8.3","3.8.2","2.7.2","2.7.1","3.8.1","3.7.4","3.7.3","3.6.5","3.6.4", "1.19.9-fix", "1.19.9-fix2"]
def bubbleSort(array) {
  for(i=array.size()-1;i>1;i--){
   for(j=0;j<i;j++){
    def VALID_TOKENS = /._/
    b = array[j].tokenize(VALID_TOKENS)[2]
    c = array[j+1].tokenize(VALID_TOKENS)[2]
    println(array[j].size())
    if ((array[j][0..2] == array[j+1][0..2] && b > c) || (array[j][0..2] == array[j+1][0..2] && b < c) ){
        array.swap(j,j+1)
        continue
    }
    if(array[j][0..2]>array[j+1][0..2]){
        array.swap(j,j+1)
    }
   }
  }
}
bubbleSort(array)
println(array)

def list = ["3.6.4-alpine", "3.6.4", "3.6.4-beta"]
def bubbleSort1(list) {
  for(i=list.size()-1;i>1;i--){
   for(j=0;j<i;j++){
    def VALID_TOKENS = /._/
    b = list[j].tokenize(VALID_TOKENS)[2]
    c = list[j+1].tokenize(VALID_TOKENS)[2]
    if ((list[j][0..2] == list[j+1][0..2] && b > c) || (list[j][0..2] == list[j+1][0..2] && b < c)){
        list.swap(j,j+1)
        continue
    }
    if(list[j][0..2]>list[j+1][0..2]){
        list.swap(j,j+1)
    }
   }
  }
}
bubbleSort1(list)
println(list)