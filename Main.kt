import java.lang.Exception

fun main() {
    val queue: MyQueue<Int> = MyQueue()
    queue.push(5)
    println("Current front: ${queue.front()}")
    queue.push(6)
    println("Current size: ${queue.size()}")
    println("Current front: ${queue.front()}")
    println("${queue.pop()} popped")
    println("Current size: ${queue.size()}")
    println("Current front: ${queue.front()}")
    println("${queue.pop()} popped")
    try {
        println("Current front: ${queue.front()}")
    } catch (e: Exception) {
        println(e.message)
    }
    try {
        println("${queue.pop()} popped")
    } catch (e: Exception) {
        println(e.message)
    }
    queue.push(10000)
    queue.push(1)
    println("Current front: ${queue.front()}")
    queue.clear()
    try {
        println("Current front: ${queue.front()}")
    } catch (e: Exception) {
        println(e.message)
    }
    try {
        println("${queue.pop()} popped")
    } catch (e: Exception) {
        println(e.message)
    }

    for (i in 1..100_000_010) {
        queue.push(i)
    }
    queue.clear()
    queue.push(5)
    println(queue.size())
}