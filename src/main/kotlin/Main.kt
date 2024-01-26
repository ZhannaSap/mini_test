import java.util.Collections.swap

fun main(args: Array<String>) {

    val list = listOf(123, 1293494, 0, -234, -699992, 235963586, 6464, 1,2,4,6)

    var sorted = false
    while (!sorted) {
        sorted = true
        for (i in 1 until list.size) {
            val index = list[i-1]
            val previous: Int = index
            val current: Int = list[i]
            if (previous > current) {
                swap(list, i - 1, i)
                sorted = false
            }
        }
    }
    println(list)
}