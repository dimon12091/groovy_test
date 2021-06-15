@NonCPS
List versions = [ '02.2.02.01', '02.2.02.02', '02.2.03.01']
String mostRecentVersion = versions.sort {a, b ->
  def a1 = a.tokenize('.')*.toInteger(), b1 = b.tokenize('.')*.toInteger()

  for (i in 0..<[a1.size(), b1.size()].min()){
    if (a1[i] != b1[i]) {
      return a1[i] <=> b1[i]
    }
  }
}[-1]

assert mostRecentVersion == '02.2.03.01'


// versions = versions.sort {a, b ->
//   def a1 = a.tokenize('.')*.toInteger(), b1 = b.tokenize('.')*.toInteger()
//   for (i in 0..<[a1.size(), b1.size()].min())
//     if (a1[i] != b1[i]) return a1[i] <=> b1[i]
//   0
// }


//
// def recurse
// def versionArraySort = { a1, a2 ->
//     def headCompare = a1[0] <=> a2[0]
//     if (a1.size() == 1 || a2.size() == 1 || headCompare != 0) {
//         return headCompare
//     } else {
//         return recurse(a1[1..-1], a2[1..-1])
//     }
// }
// // fool Groovy to understand recursive closure
// recurse = versionArraySort
//
// def versionStringSort = { s1, s2 ->
//     def nums = { it.tokenize('.').collect{ it.toInteger() } }
//     versionArraySort(nums(s1), nums(s2))
// }
//
// versions = ["1.10.0","1.9.10","1.9.9","1.9.11"]
// println versions.sort()
// println versions.sort(versionStringSort)
