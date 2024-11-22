package org.netology_exceptions

import kotlin.math.roundToInt

fun main() {
    musicDiscount(100, false)
    musicDiscount(100, true)
    musicDiscount(1002, true)
    musicDiscount(1002, false)
    musicDiscount(10002, false)
    musicDiscount(10002, true)


}

fun musicDiscount(orderAmount: Int, isRegular: Boolean) {
    val isRegularCustomer = isRegular
    val regularDiscount = 0.01
    val oneHundredToTenThousandDiscount = 100
    val maxDiscount = 0.05
    var resultAmount = 0
    if (orderAmount in (0..1000)) {
        resultAmount = orderAmount
    } else if (orderAmount in (1001..10000)) {
        resultAmount = orderAmount - oneHundredToTenThousandDiscount
    } else if (orderAmount >= 10001) {
        resultAmount = orderAmount - (orderAmount * maxDiscount).roundToInt()
    }
    println(if (isRegular) (resultAmount - (resultAmount * regularDiscount).roundToInt()) else resultAmount)
}
