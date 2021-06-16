def f = ["1.0.12", "1.0.2", "0.1",
"0.1.0.2","0.2", "2.0", "0.2.0.4",
"0.2.0.3.1", "1.5.2_05", "1.5.2_04", "1.5.2_10","1.6.0_01","2.0.0_02", "1.0RC2", "1.0RC1","3.1"]

println (f)
@NonCPS
for x in f {
    def VALID_TOKENS = /._/
    x = x.tokenize(VALID_TOKENS)
}
def versionComparator = { a, b->
  def VALID_TOKENS = /._/
  a = a.tokenize(VALID_TOKENS)
  b = b.tokenize(VALID_TOKENS)
}
f.sort(versionComparator)