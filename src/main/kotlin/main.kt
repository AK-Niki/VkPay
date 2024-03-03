fun main() {
    println(calculateCommission( "MIR", 0, 150000))
}

fun calculateCommission(
    cardType: String,
    totalTransfersThisMonth: Int,
    transferAmount: Int
): String {
    val dailyLimit = 150000
    val monthlyLimit = 600000
    val masterCardCommissionRate = 0.006
    val visaCommissionRate = 0.0075
    val visaMinCommission = 35

    // Проверка превышения месячного лимита
    if (totalTransfersThisMonth + transferAmount > monthlyLimit) {
        return "Превышен месячный лимит"
    }

    // Проверка превышения суточного лимита
    if (transferAmount > dailyLimit) {
        return "Превышен суточный лимит"
    }

    // Расчет комиссии в зависимости от типа карты
    return when (cardType) {
        "Mastercard", "Maestro" -> {
            val commission = if (transferAmount in 300..75000) {
                0
            } else {
                val commissionAmount = (transferAmount * masterCardCommissionRate).toInt() + 20
                commissionAmount
            }
            "Транзакция выполнена успешно. Комиссия: $commission"
        }
        "Visa", "MIR" -> {
            val commission = (transferAmount * visaCommissionRate).toInt()
            val finalCommission = if (commission < visaMinCommission) visaMinCommission else commission
            "Транзакция выполнена успешно. Комиссия: $finalCommission"
        }
        "VK Pay" -> {
            "Транзакция выполнена успешно. Комиссия: 0"
        }
        else -> "Транзакция не выполнена успешно"
    }
}