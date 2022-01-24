import kotlin.test.Test
import kotlin.test.assertEquals

internal class LeapYearTest {
    @Test
    fun testLeapYearDividedBy400() {
        val expected = true
        assertEquals(expected, isLeapYear(2000));
    }
    @Test
    fun testNotLeapYearDividedBy100() {
        val expected = false
        assertEquals(expected, isLeapYear(2100))
    }
    @Test
    fun testLeapYearDivideBy4() {
        val expected = true
        assertEquals(expected, isLeapYear(2004))
    }
}