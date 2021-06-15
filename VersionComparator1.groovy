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