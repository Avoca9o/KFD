import java.lang.Exception

class MyQueue<T> {
    private var base: MutableList<T> = mutableListOf()
    private var start = 0
    private var end = 0

    fun push(elem: T) {
        base.add(elem)
        end++
//        println("$elem pushed")
    }

    fun pop(): T {
        if (start == end) {
            throw Exception("Exception: You can't pop elements from an empty queue")
        }
        return base[start++]
    }

    fun size(): Int {
        return end - start
    }

    fun clear() {
        start = end
        println("queue cleared")
    }

    fun front(): T {
        if (start == end) {
            throw Exception("Exception: Empty queue")
        }
        return base[start]
    }
}