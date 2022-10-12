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
        if (start > 100000) {
            base = base.drop(100000).toMutableList()
            start = 0
            end -= 100000
        }
        return base[start++]
    }

    fun size(): Int {
        return end - start
    }

    fun clear() {
        base = mutableListOf()
        start = 0
        end = 0
        println("queue cleared")
    }

    fun front(): T {
        if (start == end) {
            throw Exception("Exception: Empty queue")
        }
        return base[start]
    }
}
