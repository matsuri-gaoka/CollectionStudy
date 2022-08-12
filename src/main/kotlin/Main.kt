fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(99, 98, 97)
    printList(list1.insertRange(list2, 2))
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