
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
myList = ['1.9.42', '1.9.36', '1.9.31', '1.7.3', '1.19.29', '1.18.15', '1.17.40', '1.16.24', '1.15.34', '1.14.20', '1.13.48', '1.13.34', '1.11.36', '1.11.26']
        for(i=myList.size()-1;i>1;i--){
            for(j=0;j<i;j++){
                    if (myList[j].tokenize(".")[2].equals(null) == false){
                        if (myList[j].tokenize(".")[0] == myList[j+1].tokenize(".")[0] && myList[j].tokenize(".")[1].toInteger() < myList[j+1].tokenize(".")[1].toInteger() &&  myList[j].tokenize('.')[2].matches("(?i).*[a-zа-я].*") == false) {
                            myList.swap(j,j+1)
                            continue
                        }
                    }
            }
        }