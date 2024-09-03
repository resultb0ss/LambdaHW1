fun main() {
    val printRepeat = { count: Int, message: String ->
        repeat(count){
            println(message)
        }
    }

    printRepeat(10,"Hello World")
}