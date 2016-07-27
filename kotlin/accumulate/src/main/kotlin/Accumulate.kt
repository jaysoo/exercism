object Accumulate {
    fun <T>accumulate(xs: Collection<T>, f: (T) -> Any): Collection<Any> {
        val acc = mutableListOf<Any>()
        for(i in xs) {
            acc += f(i)
        }
        return acc
    }
}