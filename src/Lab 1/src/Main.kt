fun main() {
    val array = arrayOf(-1, -2, -3, -4, -5, 1, 1, 1, 1, 1, 1, -2, 0, -8, 0, 6, -5, 0, 3, 2, 0, 1, 2, 3, 4, 56, 7)
    var zeros = 0
    var pluses = array.size - 1
    var cycles = 0

    var i = 1
    while (i <= pluses) {
        if (array[i] > 0) {
            swap(array, pluses, i)

            --pluses
            --i
        } else if (array[i] == 0) {
            swap(array, zeros, i)

            ++zeros
        }

        ++cycles
        ++i
    }

    print("\nResult: {" + array[0])
    for (j in 1 until array.size)
        print(", " + array[j])
    println("}")

    println("Cycles: $cycles")
}

private fun swap(array: Array<Int>, a: Int, b: Int) {
    val tmp = array[a]
    array[a] = array[b]
    array[b] = tmp
}
