def f = ["1.0.12", "1.0.2", "0.1",
"0.1.0.2","0.2", "2.0", "0.2.0.4",
"0.2.0.3.1", "1.5.2_05", "1.5.2_04", "1.5.2_10","1.6.0_01","2.0.0_02", "1.0RC2", "1.0RC1","3.1"]

println (f)
@NonCPS
def versionComparator = { a, b, c, d ->
  def VALID_TOKENS = /._/
  a = a.tokenize(VALID_TOKENS)
  b = b.tokenize(VALID_TOKENS)
  c = c.tokenize(VALID_TOKENS)
  d = d.tokenize(VALID_TOKENS)

  println(a)
  println(b)


f.sort(versionComparator)