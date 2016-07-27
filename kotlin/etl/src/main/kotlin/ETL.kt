object ETL {
    fun transform(original: Map<Int, List<String>>): Map<String, Int> {
        return original.flatMap { entry -> entry.value.map { word -> Pair(word.toLowerCase(), entry.key)} }.toMap()
    }
}