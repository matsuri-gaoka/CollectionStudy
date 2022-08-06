fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(99, 98, 97)
    printList(insertRange(list1, list2, 2))
}

fun <T> insertRange(original: List<T>, insert: List<T>, index: Int): List<T> {
    if(index < 0 || index > original.size){
        throw IllegalArgumentException()
    }
    return original.subList(0, index) +
            insert + original.subList(index, original.size)
}

fun <T> printList(list: List<T>) {
    for (item in list) {
        print("$item ")
    }
}