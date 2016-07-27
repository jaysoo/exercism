object WordCount {
    fun phrase(phrase: String): Map<String, Int> {
        return toWords(phrase).
                groupBy { it }.
                mapValues({ it.value.size })
    }

    private fun toWords(phrase: String): List<String> {
        return phrase.
                toLowerCase().replace(Regex("[^\\w']"), " ").trim().
                split(Regex("\\s+"))
    }
}
