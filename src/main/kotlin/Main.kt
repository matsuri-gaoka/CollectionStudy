fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(99, 98, 97)
    printList(list1.insertRange(list2, 2))
}

fun <T> insertRange(original: Iterable<T>, insert: Iterable<T>, index: Int): List<T> {
    if (index < 0 || index > original.count()) {
        throw IllegalArgumentException()
    }
    val resultList = mutableListOf<T>()
    for (x in original.withIndex()){
        if(x.index == index)
            for(y in insert) {
                resultList.add(y)
            }
        resultList.add(x.value)
    }
    if(index == original.count()) {
        for (y in insert) {
            resultList.add(y)
        }
    }
    return resultList
}

@JvmName("insertRangeT")
fun <T> List<T>.insertRange(insert: List<T>, index: Int): List<T> {
    return insertRange(this, insert, index)
}

fun <T> printList(list: List<T>) {
    for (item in list) {
        print("$item ")
    }
}