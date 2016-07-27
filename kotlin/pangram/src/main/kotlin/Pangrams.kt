object Pangrams {
    fun isPangram(s: String): Boolean {
        val lowercase = s.toLowerCase()
        return ('a'..'z').all { lowercase.contains(it) }
    }
}
