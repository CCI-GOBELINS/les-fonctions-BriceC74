import kotlin.math.*

fun evenOrOdd(type: String, amount: Int) {
    println(type)

    for (i in 1..amount) {
        when (type) {
            "even" -> if (i % 2 == 0) println(i)
            "odd" -> if (i % 2 != 0) println(i)
        }
    }
}
evenOrOdd("even", 10)
evenOrOdd("odd", 10)


fun fibonacci(amount: Int) {
    println("Fibonacci")

    var prev = 0
    var step = 1
    for (i in 1..amount) {
        var num = prev + step
        println(num)

        prev = step
        step = num
    }
}
fibonacci(10)

fun facto(number: Int = 10) {
    println("Facto")
    var step: Int = 1
    for (i in 1..number) {
        step = step * i
        println(step)
    }
}

facto()
facto(5)

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun primeNumber(amount: Int) {
    println("Prime Number")

    var foundPrimes = 0
    var i = 2
    while (foundPrimes < amount) {
        if (isPrime(i)) {
            println(i)
            foundPrimes++
        }
        i++
    }
}

primeNumber(10)