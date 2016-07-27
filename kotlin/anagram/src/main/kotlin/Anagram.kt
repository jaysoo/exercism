data class Anagram(val word: String) {
    private val lowered = word.toLowerCase()
    private val normalized = normalize(word)

    fun match(words: List<String>): List<String> {
        return words.filter {
            lowered != it.toLowerCase() && normalized == normalize(it)
        }
    }

    private fun normalize(word: String): String {
        return word.toLowerCase().toList().sorted().joinToString("")
    }
}
