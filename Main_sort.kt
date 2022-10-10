fun<T> MutableList<T>.swap(base: MutableList<T>, i: Int, j: Int) {
    val tmp = base[i]
    base[i] = base[j]
    base[j] = tmp
}

fun<T: Comparable<T>> insertionSort(base: MutableList<T>) {
    for (i in 1 until base.size) {
        var pos = i
        while (pos > 0 && base[pos] < base[pos - 1]) {
            base.swap(base, pos, pos - 1)
            --pos
        }
    }
}

fun main() {
    val base = readln().split(" ").map { it.toDouble() }.toMutableList()
    insertionSort(base)
    println(base.joinToString(" "))
}