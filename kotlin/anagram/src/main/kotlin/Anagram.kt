data class Anagram(val baseWord: String) {
    private val sortedLowerBaseWord = baseWord.toSortedLowerCase()
    
    fun match(words: List<String>): List<String> =
        words.
            filterNot { it.equals(baseWord, ignoreCase = true) }.
            filter { it.toSortedLowerCase() == sortedLowerBaseWord }
}

fun String.toSortedLowerCase(): List<Char> = this.toLowerCase().toList().sorted()
