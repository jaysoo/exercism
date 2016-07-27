import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(val initialDateTime: LocalDateTime) {
    constructor(initialDate: LocalDate) : this(initialDate.atTime(0, 0))
    val date = initialDateTime.plusSeconds(1000000000)
}
