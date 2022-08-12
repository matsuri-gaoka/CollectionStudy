fun main(args: Array<String>) {
    val iterable1 = MyIterable()
    val iterable2 = MyIterable()

    val iterable3 = insertRange(iterable1, iterable2, 1) //ここで無限ループ
    println(iterable3.first())
}

fun <T> insertRange(original: Iterable<T>, insert: Iterable<T>, index: Int): Iterable<T> {
    if (index < 0 || index > original.count()) {
        throw IllegalArgumentException()
    }
    val resultList = mutableListOf<T>()
    return when (index) {
        0 -> insert + original
        original.count() -> original + insert
        else -> {
            for ((i, x) in original.withIndex()) {
                if (i == index) resultList.addAll(insert)
                resultList.add(x)
            }
            resultList
        }
    }
}

@JvmName("insertRangeT")
fun <T> List<T>.insertRange(insert: List<T>, index: Int): Iterable<T> {
    return insertRange(this, insert, index)
}

fun <T> printList(list: Iterable<T>) {
    for (item in list) {
        print("$item ")
    }
}

class MyIterable : Iterable<Int> {
    override operator fun iterator(): Iterator<Int> {
        return MyIterator()
    }
}

class MyIterator : Iterator<Int> {
    var num = 1

    override fun hasNext(): Boolean {
        return true
    }

    override fun next(): Int {
        return num++
    }
}