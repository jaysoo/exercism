object RnaTranscription {
    fun ofDna(strand: String): String = strand.map { complement(it) }.joinToString("")

    fun complement(nucleotide: Char): Char  = when (nucleotide) {
        'G' -> 'C'
        'C' -> 'G'
        'T' -> 'A'
        'A' -> 'U'
        else -> throw IllegalArgumentException("Invalid DNA sequence")
    }
}
