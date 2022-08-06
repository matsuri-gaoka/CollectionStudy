import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFails

internal class MainKtTest {

    @Test
    fun insertRangeException(){
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        assertFails { insertRange(originalList, insertList, -1) }
    }

    @Test
    fun insertRange() {
        val originalList = listOf(1, 2, 3, 4, 5)
        val insertList = listOf(99, 98, 97)
        val actual = insertRange(originalList, insertList, 2)
        val expected = listOf(1, 2, 99, 98, 97, 3, 4, 5)
        assertContentEquals(actual, expected)
    }
}