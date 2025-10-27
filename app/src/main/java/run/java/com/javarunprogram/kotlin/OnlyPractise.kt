package run.java.com.javarunprogram.kotlin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import java.util.Arrays
import kotlinx.coroutines.*
import java.util.concurrent.Executors


fun main() = runBlocking {
    // Test with threads
    val startTime1 = System.currentTimeMillis()
    val threadPool = Executors.newFixedThreadPool(10_000)
    val threads = mutableListOf<Thread>()

    // Creating 10,000 threads (expensive!)
    repeat(10_000) { i ->
        val thread = Thread {
            Thread.sleep(100)
        }
        threads.add(thread)
        thread.start()
    }
    threads.forEach { it.join() }
    println("Threads time: ${System.currentTimeMillis() - startTime1} ms")

    // Test with coroutines
    val startTime2 = System.currentTimeMillis()
    val jobs = List(100_000) { i -> // 10x more!
        launch(Dispatchers.Default) {
            delay(100)
        }
    }
    jobs.forEach { it.join() }
    println("Coroutines time: ${System.currentTimeMillis() - startTime2} ms")
}





