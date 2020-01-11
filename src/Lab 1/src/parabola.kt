fun main() {
    val a = 1
    val b = 4
    val c = 0

    val x = -2
    val y = -4

    val x0 = -b / (2 * a)
    val y0 = (b * b - 4 * a * c) / (-4 * a)
    println("X: $x0; Y: $y0")

    val borderY = a * x * x + b * x + c

    if (y >= borderY && a > 0 || y <= borderY && a < 0) {
        println("True")
    } else {
        println("False")
    }
}
