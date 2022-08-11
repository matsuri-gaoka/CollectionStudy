import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFails

internal class MainKtTest {

    @Test
    fun insertRangeException1() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        assertFails { insertRange(originalList, insertList, -1) }
    }

    @Test
    fun insertRange1() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        val actual = insertRange(originalList, insertList, 0)
        val expected = listOf(99, 98, 97, 1, 2, 3, 4, 5)
        assertContentEquals(actual, expected)
    }

    @Test
    fun insertRange2() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        val actual = insertRange(originalList, insertList, 1)
        val expected = listOf(1, 99, 98, 97, 2, 3, 4, 5)
        assertContentEquals(actual, expected)
    }

    @Test
    fun insertRange3() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        val actual = insertRange(originalList, insertList, 2)
        val expected = listOf(1, 2, 99, 98, 97, 3, 4, 5)
        assertContentEquals(actual, expected)
    }

    @Test
    fun insertRange4() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        val actual = insertRange(originalList, insertList, 3)
        val expected = listOf(1, 2, 3, 99, 98, 97, 4, 5)
        assertContentEquals(actual, expected)
    }

    @Test
    fun insertRange5() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        val actual = insertRange(originalList, insertList, 4)
        val expected = listOf(1, 2, 3, 4, 99, 98, 97, 5)
        assertContentEquals(actual, expected)
    }

    @Test
    fun insertRange6() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        val actual = insertRange(originalList, insertList, 5)
        val expected = listOf(1, 2, 3, 4, 5, 99, 98, 97)
        assertContentEquals(actual, expected)
    }

    @Test
    fun insertRangeWithSet1() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertSet = setOf(99, 99, 99, 98, 98, 97)
        val actual = insertRange(originalList, insertSet, 5)
        val expected = listOf(1, 2, 3, 4, 5, 99, 98, 97)
        assertContentEquals(actual, expected)
    }

    @Test
    fun insertRangeException2() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        assertFails { insertRange(originalList, insertList, 6) }
    }
}