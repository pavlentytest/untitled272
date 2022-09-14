import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    scan.useLocale(Locale.US)
    val m = scan.nextFloat() //wall 1
    val n = scan.nextFloat() //wall 2
    val a = scan.nextFloat() // side 1
    val b = scan.nextFloat() // side 2
    if (a <= m && b <= n)
        println(message = "YES")
    else if (a <= n && b <= m)
        println(message = "YES")
    else println(message = "NO")
}