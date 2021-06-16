String mostRecentVersion(List versions) {
  def sorted = versions.sort(false) { a, b ->

    List verA = a.tokenize('.')
    List verB = b.tokenize('.')

    def commonIndices = Math.min(verA.size(), verB.size())

    for (int i = 0; i < commonIndices; ++i) {
      def numA = verA[i].toInteger()
      def numB = verB[i].toInteger()
      println "comparing $numA and $numB"

      if (numA != numB) {
        return numA <=> numB
      }
    }

    // If we got this far then all the common indices are identical, so whichever version is longer must be more recent
    verA.size() <=> verB.size()
  }

  println "sorted versions: $sorted"
  sorted[-1]
}


assert mostRecentVersion(['02.2.02.01', '02.2.02.02', '02.2.03.01']) == '02.2.03.01'
assert mostRecentVersion(['4', '2']) == '4'
assert mostRecentVersion(['4.1', '4']) == '4.1'
assert mostRecentVersion(['4.1', '5']) == '5'
