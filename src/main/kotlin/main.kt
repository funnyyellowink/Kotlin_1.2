fun main() {
    comisionCalc()
    likesCount()
    discount()
}
fun comisionCalc() {
    println("Введите сумму перевода")
    val sum = readLine()?.toDoubleOrNull()
    val comision = 0.0075
    val totalComision : Double
    var amount = sum
    if (sum != null) {
        totalComision = sum * comision
        amount = if (totalComision < 35) {
            sum - 35
        } else sum - sum * comision
    }
    println("Сумма перевода с учетом комиссии $amount")
}
fun likesCount() {
    println("Введите количество лайков")
    val likes = readLine()?.toIntOrNull()
    var usersNumber = "людям"
    if (likes != null) {
        usersNumber = if (likes % 100 in 11..19 ) "людям"
        else when (likes % 10) {
            1 -> "человеку"
            else -> "людям"
        }
    }
    println("Понравилось $likes $usersNumber")
}
fun discount() {
    println("Введите сумму предыдущих покупок")
    val previousSum = readLine()?.toIntOrNull()
    var userDiscount = 0.0
    var amount = previousSum?.toDouble()
    if (previousSum != null) {
        when  {
            previousSum in 1..1000 -> userDiscount = 0.0
            previousSum in 1001..10000 -> userDiscount = 0.1
            previousSum > 10001 -> userDiscount = 0.5
        }
        amount = previousSum - previousSum * userDiscount
    }
    println("Сумма с учетом скидки $amount")
}