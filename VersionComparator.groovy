
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
myList = ['1.20.4', '1.20.3', '1.20.2', '1.20.1', '1.19.duplicate_actions.5',  '1.19.duplicate_actions.4', '1.19.duplicate_actions.3', '1.19.duplicate_actions.2', '1.19.duplicate_actions.1', '1.19.8', '1.19.5', '1.19.4', '1.19.23', '1.19.2', '1.19.19', '1.19.17', '1.18.9', '1.18.8', '1.18.4', '1.18.3', '1.18.2', '1.18.1', '1.17.9.mocked_rules_assignment', '1.17.8.mocked_rules_assignment', '1.17.27', '1.17.23', '1.17.1.mocked_rules_assignment', '1.17.10.mocked_rules_assignment', '1.17.04', '1.16.estate-for-web', '1.16.9', '1.16.7', '1.16.6', '1.16.5', '1.16.4.estate-for-web', '1.16.3.estate-for-web', '1.15.fix_report_generation_02', '1.14.testDocumentExplorer9', '1.14.testDocumentExplorer8']
println(myList[0].tokenize(".")[0])
for(i=myList.size()-1;i>1;i--){
            for(j=0;j<i;j++){

                if (myList[j] == "<none>"){
                    myList.swap(j,j+1)
                    continue
                }

                if (myList[j].tokenize('.')[2].equals(null) == false && myList[j+1].tokenize('.')[2].equals(null) == false ) {

                    if ((myList[j].tokenize('.')[3] != null) && (myList[j+1] != "<none>") ){
                        myList.swap(j,j+1)
                        continue
                    }

                    if (myList[j].tokenize(".")[2].indexOf("-") == -1 && myList[j+1].tokenize(".")[2].indexOf("-") == -1)     {
                        if ((myList[j].tokenize(".")[0] == myList[j+1].tokenize(".")[0] && myList[j].tokenize(".")[1] == myList[j+1].tokenize(".")[1]) && myList[j].tokenize('.')[2].matches("(?i).*[a-zа-я].*") == false &&  myList[j].tokenize('.')[2].toInteger() < myList[j+1].tokenize('.')[2].toInteger()){
                            myList.swap(j,j+1)
                            continue
                        }
                    }

                    if ((myList[j].tokenize(".")[0] == myList[j+1].tokenize(".")[0] && myList[j].tokenize(".")[1] == myList[j+1].tokenize(".")[1]) && (myList[j].tokenize('.')[2].indexOf("-") == 1) && (myList[j].tokenize(".")[2].split("-")[0].toInteger() <  myList[j+1].tokenize(".")[2].split("-")[0].toInteger())) {
                        myList.swap(j,j+1)
                        continue
                    }

                    if (((myList[j].tokenize(".")[0] == myList[j+1].tokenize(".")[0] && myList[j].tokenize(".")[1] == myList[j+1].tokenize(".")[1]) || myList[j][0..3] > myList[j+1][0..3] ) && myList[j].tokenize('.')[2].matches("(?i).*[a-zа-я].*") == true && myList[j].tokenize('.')[2].indexOf("-") == -1 ){
                        myList.swap(j,j+1)
                        continue
                    }
                    continue
                }

                if (myList[j].tokenize(".")[0] > myList[j+1].tokenize(".")[0] ){
                    myList.swap(j,j+1)
                    continue
                }
                if (myList[j].tokenize(".")[2].equals(null) == true) {
                     myList.swap(j,j+1)
                     continue
                }
            }

}
println(myList)
head_tag = myList[0]
rmList = []
var = 0
control_tag = "0.0.0"
    if (head_tag != "" ) {
        for (tag in myList) {
            if (tag != "<none>") {
                if (tag.tokenize(".")[2].equals(null) == true){
                    tag = tag + ".0"
                }
                if (tag.tokenize(".")[0] == head_tag.tokenize(".")[0] && tag.tokenize(".")[1] == head_tag.tokenize(".")[1]) {
                    continue
                }
                if (var > 2 ) {
                    rmList.add(tag)
                    continue
                }

                if ( (tag.tokenize(".")[0] == head_tag.tokenize(".")[0] && tag.tokenize(".")[1] == head_tag.tokenize(".")[1]) && (tag.tokenize(".")[2].split("-")[0].toInteger() <= control_tag.tokenize(".")[2].split("-")[0].toInteger()) ) {
                    rmList.add(tag)
                    continue
                }

                if ( tag > tag[0..3] && tag < head_tag ) {
                    control_tag = tag

                    var = var + 1
                }
            }
        println(rmList)
        }
    }

