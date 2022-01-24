fun isLeapYear(year: Int): Boolean {
//    return year % 400 === 0 || ((year % 100 !== 0)  && (year % 4 === 0))
    return when {
        year % 400 === 0 -> true
        year % 100 === 0 -> false
        else -> year % 4 === 0
    }
}