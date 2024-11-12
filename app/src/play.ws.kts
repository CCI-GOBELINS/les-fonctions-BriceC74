fun evenOrOdd(type: String ,amount: Int) {
    println(type)

    for (i in 1..amount) {
        when (type) {
            "even" -> if (i % 2 == 0) println(i)
            "odd" -> if(i % 2 != 0) println(i)
        }
    }
}
evenOrOdd("even", 10)
evenOrOdd("odd", 10)


