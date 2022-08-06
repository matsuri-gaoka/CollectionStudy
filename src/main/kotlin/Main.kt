fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(99, 98, 97)
    printList(list1.insertRange(list2, 2))
}

fun <T> insertRange(original: List<T>, insert: List<T>, index: Int): List<T> {
    if(index < 0 || index > original.size){
        //throw IllegalArgumentException()
    }
    return original.subList(0, index) +
            insert + original.subList(index, original.size)
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