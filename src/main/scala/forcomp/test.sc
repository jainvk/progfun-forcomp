import forcomp.Anagrams
Anagrams.wordOccurrences("Every")
List("Converts", "the", "word", "into").mkString
List("Converts", "the", "word", "into", "owrd")
  .groupBy(w => Anagrams.wordOccurrences(w))

//.dictionaryByOccurrences

//Anagrams.dictionaryByOccurrences(Anagrams.wordOccurrences("aaabb"))

Anagrams.combinations(List(('a', 2), ('b', 2)))
val x = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
val y = List(('r', 1))
Anagrams.subtract(x, y)
